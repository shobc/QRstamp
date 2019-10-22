import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.ServletContext;

import Authentication.InsertSession;
import function.CutWifi;
import function.PathHolder;

//登録用のサーブレット
public class RegisterServlet extends HttpServlet{
    public void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException{
        //学校のwifiに接続されている場合例外を吐くクラス
        CutWifi.Judge(req);
        //与えられた仮想パスに対応する実際のパス
        PathHolder.pathName = getServletContext().getRealPath("/");
        //各端末にセッションに一意性の番号を持たせるためのクラス
        InsertSession is = new InsertSession();
        is.setSession(req);
        //Access.htmlにダイレクトにアクセス
        res.sendRedirect("stamp");
    }
}