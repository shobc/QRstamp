package Authentication;

import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Arrays;
import javax.servlet.http.Cookie;
import java.util.Enumeration;
import java.lang.StringBuffer;


import InsertData.EnterValue;
import Bean.QRBean;

public class InsertSession {
    private UserCount uc;
    private QRBean qb;
    public InsertSession(UserCount uc){
        this.uc = uc;
    }
    public void setSession(HttpServletRequest req,HttpServletResponse res){
        System.out.println("req.getRemoteAddr()="+req.getRemoteAddr());
        String num = req.getRemoteAddr();
        String[] valueString = new String[9];
        String countString = null;
        HttpSession session = req.getSession();
        qb = (QRBean) session.getAttribute("qb");
        String IPADD = String.valueOf(num.replace(".",""));
        if (qb == null) {
            qb = new QRBean();
            int count = uc.getCount();
            System.out.println("セッションのBeanに入れる値 " + count);
            qb.setNo(Integer.parseInt(IPADD));
            session.setAttribute("qb", qb);
            qb = (QRBean) session.getAttribute("qb");
            System.out.println("セッションにセットした値" + qb.getNo());
            countString = String.valueOf(qb.getNo());
            System.out.println("countString " + countString);
            Arrays.fill(valueString, "false");
            EnterValue.newValueload(countString, valueString);
        }
    }
}