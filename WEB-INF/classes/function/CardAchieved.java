package function;

import Bean.QRBean;
import javax.servlet.http.HttpSession;

public class CardAchieved{
    public void Judge(HttpSession session,QRBean qb){
        String[] Department=qb.getJudgement();
        int j=0;
        for(int i=0;i<9;i++){
            boolean boo = Boolean.valueOf(Department[i]);
            if(boo){
                j++;
            }
        }
        if(j==8){
            System.out.println("if•¶ˆ—");
            session.setAttribute("judge","true");
        }else{
            session.setAttribute("judge","false");
        }
    }
}