package function;

import Bean.QRBean;
import InsertData.EnterValue;

import javax.servlet.http.Cookie;

public class SessionJudge{
    public void Judge(Cookie[] cookie,QRBean qb){
        if (cookie != null){
            //クッキーの数だけループ処理
            for (int i = 0 ; i < cookie.length ; i++){
                //取得したい値と合っているかの判定
                if (cookie[i].getName().equals("SessionNumber")){
                    String number= cookie[i].getValue();
                    qb.setNo(Integer.parseInt(number));
                }
            }
        }
        //Beanに値をセットするクラス
        EnterValue.getValue(qb);
    }
}