import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Authentication.RevivalgetSession;
import function.PathHolder;

public class RevivalSessionServlet extends HttpServlet{
    public void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException{
        //パラメータからの値を取得（この値はcookieでのユーザーが本来sessionで持つ値）
        String sessionNum = req.getParameter("sessionNum");
        //文字列からint型に変換
        int num = Integer.parseInt(sessionNum);
        //与えられた仮想パスに対応する実際のパス（tomcatがダウンしてからの初めての取得）
        PathHolder.pathName = getServletContext().getRealPath("/");
        //sessionの復活をするためのクラス
        RevivalgetSession reSession = new RevivalgetSession();
        reSession.getSession(num,req,res);
        //Access.htmlにダイレクトにアクセス
        res.sendRedirect("Access.html");
    }
}