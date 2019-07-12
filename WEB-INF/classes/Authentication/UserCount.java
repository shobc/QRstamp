package Authentication;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;

public class UserCount extends HttpServlet{
    private ServletContext context;
    private int count;
    public UserCount(ServletContext sc){
        context = sc;
    }
    public int getCount(){
        Integer value =(Integer)context.getAttribute("count");
        if(value==null){
            count = 1;
            context.setAttribute("count",count);
        }else{
            count = value.intValue();
            ++count;
            context.setAttribute("count",count);
        }
        return count;
    }
}