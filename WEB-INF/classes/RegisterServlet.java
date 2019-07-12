import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.ServletContext;

import Authentication.*;

import function.*;

public class RegisterServlet extends HttpServlet{
    public void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException{
        req.setCharacterEncoding("Windows-31J");
        PathHolder.pathName = getServletContext().getRealPath("/");
        ServletContext context =getServletContext();
        UserCount uc = new UserCount(context);
        InsertSession is = new InsertSession(uc);
        is.setSession(req);
        res.sendRedirect("Access.html");
    }
}