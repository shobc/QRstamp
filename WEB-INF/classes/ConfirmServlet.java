import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Bean.QRBean;
import InsertData.EnterValue;
import function.DepartmentJudge;

public class ConfirmServlet extends HttpServlet{
    public void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException{
        String Confirm = req.getParameter("Confirm");

        HttpSession session = req.getSession();
        QRBean qb = (QRBean) session.getAttribute("qb");

        //Bean���炷�ׂĂ̒l���擾����
        String[] Department=qb.getJudgement();
        //true�̐��𔻒肷�邽�߂̕ϐ�
        int j=0;
        //�z�񕪃��[�v����
        for(int i=0;i<9;i++){
            System.out.println(Department[i]);
            //boolean�ɕϊ�����if���Ŕ��肷��
            boolean boo = Boolean.valueOf(Department[i]);
            if(boo){
                j++;
            }
        }
        //�J�[�h�����̂Ƃ���ōς݂��o�邩����
        if(j==8){
            DepartmentJudge dj = new DepartmentJudge();
            dj.judge(Confirm,qb);
            EnterValue.Valueload(qb);
            session.setAttribute("judge","false");
        }
        session.setAttribute("qb",qb);
        res.sendRedirect("stamp");
    }
}