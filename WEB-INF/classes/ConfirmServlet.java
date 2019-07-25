import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Bean.QRBean;
import Exception.NotSessionAccessException;
import function.ConfirmJudge;
import function.CutWifi;

//BINGOカードと交換できるかの判定
public class ConfirmServlet extends HttpServlet{
    public void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException{
        //学校のwifiに接続されている場合例外を吐くクラス
        CutWifi.Judge();
        //値を取得
        String Confirm = req.getParameter("Confirm");
        //sessionを取得
        HttpSession session = req.getSession();
        //Beanを取得し代入する
        QRBean qb = (QRBean) session.getAttribute("qb");
        //Beanがあるか判定
        if(qb != null){
            //カードを交換の判定をするメソッドを呼び出し
            ConfirmJudge cj = new ConfirmJudge();
            cj.Judge(qb,session,Confirm);
            //stampページにダイレクトにアクセス
            res.sendRedirect("stamp");
        }else{
            //sessionがBeanを持っていなかったら例外を送出する
            throw new NotSessionAccessException("受付でQRを読み込んでください");
        }
    }
}