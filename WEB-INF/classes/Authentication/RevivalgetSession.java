package Authentication;

import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Cookie;

import Bean.QRBean;

public class RevivalgetSession{
    public void getSession(int number,HttpServletRequest req,HttpServletResponse res){
        HttpSession session = req.getSession();
        QRBean qb = (QRBean)session.getAttribute("qb");
        if(qb == null){
            String num = String.valueOf(number);
            qb = new QRBean();
            qb.setNo(number);
            Cookie cookie = new Cookie("SessionNumber",num);
            res.addCookie(cookie);
            System.out.println(qb.getNo());
            session.setAttribute("qb",qb);
        }
    }
}