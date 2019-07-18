package function;

import Bean.QRBean;
import InsertData.EnterValue;

public class SessionSet {
    public void setValue(String num,QRBean qb){
        //IPアドレスの.を空に変えてからInt型に変えてBeanにsetする
        qb.setNo(Integer.parseInt(num.replace(".","")));
        //Beanに値をセットするクラス
        EnterValue.getValue(qb);
    }
}