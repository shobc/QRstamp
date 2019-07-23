import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.ServletContext;





import java.net.InetAddress;
import java.net.UnknownHostException;






import Authentication.InsertSession;
import function.PathHolder;

//登録用のサーブレット
public class RegisterServlet extends HttpServlet{
    public void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException{



        try {
            InetAddress addr = InetAddress.getLocalHost();
            InetAddress addr2 = InetAddress.getLocalHost();
            if (addr.equals(addr2)) System.out.println("addrとaddr2は同じインスタンス");
            System.out.println("Local Host Name: " + addr.getHostName());
            System.out.println("IP Address     : " + addr.getHostAddress());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }





        //与えられた仮想パスに対応する実際のパス
        PathHolder.pathName = getServletContext().getRealPath("/");
        //各端末にセッションに一意性の番号を持たせるためのクラス
        InsertSession is = new InsertSession();
        is.setSession(req);
        //Access.htmlにダイレクトにアクセス
        res.sendRedirect("Access.html");
    }
}