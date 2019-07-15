package Authentication;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;

import function.Factory;


public class UserCount extends HttpServlet{
    private ServletContext context;
    private int count;
    public UserCount(ServletContext sc){
        context = sc;
    }
    public int getCount(){
        Integer value =(Integer)context.getAttribute("count");
        if(value==null){
            count = 10+Factory.getMaxKeyCount();
            context.setAttribute("count",count);
        }else{
            count = value.intValue();
            count += 10;
            context.setAttribute("count",count);
        }
        return count;
    }
}