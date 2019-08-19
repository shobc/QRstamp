package function;

import javax.servlet.http.HttpServletRequest;

import Bean.QRBean;
import InsertData.EnterValue;

//ユーザーがsessionをもっているのか判定するクラス
public class SessionJudge{
    public static QRBean judge(QRBean qb,HttpServletRequest req){
        //Beanに値があるか確認
        if(qb==null){
            //IPアドレスを取得
            String num = req.getRemoteAddr();
            //Beanをnewする
            qb = new QRBean();
            //Beanに値をセットする
            SessionSet sessionSet = new SessionSet();
            sessionSet.setValue(num,qb);
            //Beanを返す
            return qb;
        }
        //Beanに値をセットするクラス
        EnterValue.getValue(qb);
        //Beanを返す
        return qb;
    }
}