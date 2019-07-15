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
        //文字コードを設定
        req.setCharacterEncoding("windows-31j");
        //各学科に対する値を取得する
        String Department = req.getParameter("Department");
        //sessionからBeanを取得する
        HttpSession session = req.getSession();
        QRBean qb = (QRBean)session.getAttribute("qb");
        //Beanに値をセットするクラス
        EnterValue.getValue(qb);
        //Beanに新しい値をセットする
        DepartmentJudge dj = new DepartmentJudge();
        dj.judge(Department,qb);
        //新しい値をセットする
        EnterValue.Valueload(qb);
        //カード交換するための確認ボタンが出るかの判定をするクラス
        CardAchieved ca = new CardAchieved();
        ca.Judge(session,qb);
        //パラメータの値を隠すために行う
        res.sendRedirect("stamp");
    }
}