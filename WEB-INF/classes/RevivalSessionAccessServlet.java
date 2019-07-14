import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Cookie;

public class RevivalSessionAccessServlet extends HttpServlet{
    public void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException{
        // クッキーの配列を取得
        Cookie cookie[] = req.getCookies();
        //クッキーがあるかの判定
        if (cookie != null){
            //クッキーの数だけループ処理
            for (int i = 0 ; i < cookie.length ; i++){
                //取得したい値と合っているかの判定
                if (cookie[i].getName().equals("SessionNumber")){
                    String number= cookie[i].getValue();
                    req.setAttribute("number",number);
                }
            }
        }
        RequestDispatcher dis = req.getRequestDispatcher("/RevivalSession");
        dis.forward(req,res);
    }
}