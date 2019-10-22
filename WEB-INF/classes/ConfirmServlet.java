import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Bean.QRBean;
import Exception.NotSessionAccessException;
import function.ConfirmJudge;
import function.CutWifi;
import function.SessionJudge;

//BINGO�J�[�h�ƌ����ł��邩�̔���
public class ConfirmServlet extends HttpServlet{
    public void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException{
        //�w�Z��wifi�ɐڑ�����Ă���ꍇ��O��f���N���X
        CutWifi.Judge(req);
        //�l���擾
        String Confirm = req.getParameter("Confirm");
        //session���擾
        HttpSession session = req.getSession();
        //Bean���擾���������
        QRBean qb = (QRBean) session.getAttribute("qb");
        //Session�̕ێ������Ă��邩�̊m�F
        SessionJudge sj = new SessionJudge();
        qb = sj.judge(qb,req);
        //Bean�����邩����
        if(qb != null){
            //�J�[�h�������̔�������郁�\�b�h���Ăяo��
            ConfirmJudge cj = new ConfirmJudge();
            cj.Judge(qb,session,Confirm);
            //stamp�y�[�W�Ƀ_�C���N�g�ɃA�N�Z�X
            res.sendRedirect("stamp");
        }else{
            //session��Bean�������Ă��Ȃ��������O�𑗏o����
            throw new NotSessionAccessException("��t��QR��ǂݍ���ł�������");
        }
    }
}