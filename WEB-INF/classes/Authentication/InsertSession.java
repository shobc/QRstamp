package Authentication;

import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;

import InsertData.EnterValue;
import Bean.QRBean;
import function.PropertiesKeyJudge;

public class InsertSession {
    private QRBean qb;

    public void setSession(HttpServletRequest req){
        HttpSession session = req.getSession();
        qb = (QRBean) session.getAttribute("qb");
        String num = req.getRemoteAddr().replace(".","");
        if(PropertiesKeyJudge.judge(num)){
            qb = new QRBean();
            qb.setNo(Integer.parseInt(num));
            EnterValue.getValue(qb);
            session.setAttribute("qb",qb);
        }else if(qb == null) {
            qb = new QRBean();
            String[] valueString = new String[9];
            qb.setNo(Integer.parseInt(num));
            Arrays.fill(valueString, "false");
            EnterValue.newValueload(num ,valueString);
            session.setAttribute("qb",qb);
        }
    }
}