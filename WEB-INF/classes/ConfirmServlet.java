import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Bean.QRBean;
import InsertData.EnterValue;
import function.DepartmentJudge;

public class ConfirmServlet extends HttpServlet{
    public void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException{
        String Confirm = req.getParameter("Confirm");

        HttpSession session = req.getSession();
        QRBean qb = (QRBean) session.getAttribute("qb");

        //Beanからすべての値を取得する
        String[] Department=qb.getJudgement();
        //trueの数を判定するための変数
        int j=0;
        //配列分ループ処理
        for(int i=0;i<9;i++){
            System.out.println(Department[i]);
            //booleanに変換してif文で判定する
            boolean boo = Boolean.valueOf(Department[i]);
            if(boo){
                j++;
            }
        }
        //カード交換のところで済みが出るか判定
        if(j==8){
            DepartmentJudge dj = new DepartmentJudge();
            dj.judge(Confirm,qb);
            EnterValue.Valueload(qb);
            session.setAttribute("judge","false");
        }
        session.setAttribute("qb",qb);
        res.sendRedirect("stamp");
    }
}