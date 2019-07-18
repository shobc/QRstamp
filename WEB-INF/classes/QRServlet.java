import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import Bean.QRBean;
import function.*;
import InsertData.EnterValue;

public class QRServlet extends HttpServlet{
    public void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException{

        HttpSession session = req.getSession();
        //�e�w�Ȃɑ΂���l���擾����
        String Department = req.getParameter("Department");
        //session����Bean���擾����
        QRBean qb = (QRBean)session.getAttribute("qb");
        //Session�̕ێ������Ă��邩�̊m�F
        SessionJudge sj = new SessionJudge();
        qb = sj.judge(qb,req);
        //Bean�ɐV�����l���Z�b�g����
        DepartmentJudge dj = new DepartmentJudge();
        dj.judge(Department,qb);
        //�V�����l���Z�b�g����
        EnterValue.Valueload(qb);
        //�J�[�h�������邽�߂̊m�F�{�^�����o�邩�̔��������N���X
        CardAchieved ca = new CardAchieved();
        ca.Judge(session,qb);
        //session�ɒl���ăZ�b�g����
        session.setAttribute("qb",qb);
        //�p�����[�^�̒l���B�����߂ɍs��
        res.sendRedirect("stamp");
    }
}