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
        //文字コードの設定
        req.setCharacterEncoding("Windows-31J");
        //与えられた仮想パスに対応する実際のパス
        PathHolder.pathName = getServletContext().getRealPath("/");
        //contextScopeの取得
        ServletContext context =getServletContext();
        //一意性の番号を生成するためクラスをインスタンス化
        UserCount uc = new UserCount(context);
        //各端末にセッションに一意性の番号を持たせるためのクラス
        InsertSession is = new InsertSession(uc);
        is.setSession(req,res);
        //Access.htmlにダイレクトにアクセス
        res.sendRedirect("Access.html");
    }
}