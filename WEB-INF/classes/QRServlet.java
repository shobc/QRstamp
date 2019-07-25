import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
//サーバーのIPアドレスを取得
import java.net.InetAddress;

import Bean.QRBean;
import function.*;
import InsertData.EnterValue;

//各学科のQRについてるパラメータを読み込むためのServlet
public class QRServlet extends HttpServlet{
    public void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException{
        //学校のwifiに接続されている場合例外を吐くクラス
        CutWifi.Judge();
        //与えられた仮想パスに対応する実際のパス sessionが切れてしまった場合のための保険
        PathHolder.pathName = getServletContext().getRealPath("/");
        //各学科に対する値を取得する
        String Department = req.getParameter("Department");
        //sessionからBeanを取得する
        HttpSession session = req.getSession();
        QRBean qb = (QRBean)session.getAttribute("qb");
        //Sessionの保持をしているかの確認
        SessionJudge sj = new SessionJudge();
        qb = sj.judge(qb,req);
        //Beanに新しい値をセットする
        DepartmentJudge dj = new DepartmentJudge();
        dj.judge(Department,qb);
        //新しい値をセットする
        EnterValue.Valueload(qb);
        //カード交換するための確認ボタンが出るかの判定をするクラス
        CardAchieved ca = new CardAchieved();
        ca.Judge(session,qb);
        //sessionに値を再セットする
        session.setAttribute("qb",qb);
        //パラメータの値を隠すために行う
        res.sendRedirect("stamp");
    }
}