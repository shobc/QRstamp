package Authentication;

import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;

import InsertData.EnterValue;
import Bean.QRBean;

public class InsertSession{
    private UserCount uc;
    private QRBean qb;
    public InsertSession(UserCount uc){
        this.uc = uc;
    }
    public void setSession(HttpServletRequest req){
        String[] valueString = new String[9];
        String countString = null;

        HttpSession session = req.getSession();

        qb= (QRBean)session.getAttribute("qb");

        if(qb == null){
            qb = new QRBean();

            int count = uc.getCount();

            System.out.println("せっっションのBeanに入れる値 "+count);

            qb.setNo(count);

            session.setAttribute("qb",qb);

            qb = (QRBean)session.getAttribute("qb");

            System.out.println("セッションにセットした値"+qb.getNo());

            countString = String.valueOf(count);

            System.out.println("countString "+countString);

            Arrays.fill(valueString,"false");

            EnterValue.newValueload(countString,valueString);

        }
    }
}