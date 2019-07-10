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

        PathHolder.pathName = getServletContext().getRealPath("/");
//        System.out.println(PathHolder.pathName);

        HttpSession session = req.getSession();
        String count = String.valueOf(session.getAttribute("count"));
//        System.out.println("session\t"+count);

        QRBean qb = EnterValue.getValue(count);
        System.out.println(Department);
        DepartmentJudge dj = new DepartmentJudge();
        dj.judge(Department,qb);
        EnterValue.Valueload(count,qb);
        String[] aa=qb.getJudgement();
        for(int i=0;i<9;i++){
            System.out.println(aa[i]);
        }
        session.invalidate();
        req.setAttribute("qb",qb);
        RequestDispatcher dis = req.getRequestDispatcher("stamp");

        dis.forward(req,res);
    }
}