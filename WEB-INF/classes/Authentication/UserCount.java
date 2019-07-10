package Authentication;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;

public class UserCount extends HttpServlet{
    private ServletContext context;
    public UserCount(ServletContext sc){
        context = sc;
    }
    public Integer getCount(){
        Integer count =null;
        Integer value =(Integer)context.getAttribute("count");
        if(value==null){
            count = new Integer(1);
            context.setAttribute("count",count);
        }else{
            count = value.intValue();
            ++count;
            Integer newValue = new Integer(count);
            context.setAttribute("count",count);
        }
        return count;
    }
}