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
        //�����R�[�h��ݒ�
        req.setCharacterEncoding("windows-31j");
        //�e�w�Ȃɑ΂���l���擾����
        String Department = req.getParameter("Department");
        //session����Bean���擾����
        HttpSession session = req.getSession();
        QRBean qb = (QRBean)session.getAttribute("qb");
        //Bean�ɒl���Z�b�g����N���X
        EnterValue.getValue(qb);
        //Bean�ɐV�����l���Z�b�g����
        DepartmentJudge dj = new DepartmentJudge();
        dj.judge(Department,qb);
        //�V�����l���Z�b�g����
        EnterValue.Valueload(qb);
        //�J�[�h�������邽�߂̊m�F�{�^�����o�邩�̔��������N���X
        CardAchieved ca = new CardAchieved();
        ca.Judge(session,qb);
        //�p�����[�^�̒l���B�����߂ɍs��
        res.sendRedirect("stamp");
    }
}