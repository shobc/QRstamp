package Authentication;

import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpServletRequest;
import InsertData.EnterValue;

public class InsertSession{
    private UserCount uc;
    public InsertSession(UserCount uc){
        this.uc = uc;
    }
    public void setSession(HttpServletRequest req){
        HttpSession session = req.getSession();
        Integer value = (Integer)session.getAttribute("count");
        if(value == null){
            Integer count = uc.getCount();
            System.out.println(count);
            session.setAttribute("count",count);
            String countString = String.valueOf(count);
            String[] valueString = {null,null,null,null,null,null,null,null,null};
            EnterValue.newValueload(countString,valueString);
        }
    }
}