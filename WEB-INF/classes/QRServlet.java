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
        req.setCharacterEncoding("Windows-31j");
        String Department = req.getParameter("Department");

        HttpSession session = req.getSession();
        QRBean qb = (QRBean)session.getAttribute("qb");

        EnterValue.getValue(qb);

        DepartmentJudge dj = new DepartmentJudge();
        dj.judge(Department,qb);

        EnterValue.Valueload(qb);

        CardAchieved ca = new CardAchieved();
        ca.Judge(session,qb);
//        RequestDispatcher dis = req.getRequestDispatcher("stamp");
        res.sendRedirect("stamp");
    }
}