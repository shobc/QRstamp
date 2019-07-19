package Authentication;

import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;

import InsertData.EnterValue;
import Bean.QRBean;
import function.PropertiesKeyJudge;
//sessionにBeanを持たせるクラス
public class InsertSession {
    private QRBean qb;
    public void setSession(HttpServletRequest req){
        //sessionを取得する
        HttpSession session = req.getSession();
        //sessionの中からBeanを取得する
        qb = (QRBean) session.getAttribute("qb");
        //IPアドレスを取得して.を空白と入れ替えてString型に代入する
        String num = req.getRemoteAddr().replace(".","");
        //IPアドレスがPropertiesファイルに入っているか判定する
        if(PropertiesKeyJudge.judge(num)){
            //新しくBeanを生成
            qb = new QRBean();
            //BeanのNoに値をセットする
            qb.setNo(Integer.parseInt(num));
            //PropertiesファイルからBeanに値をセットする
            EnterValue.getValue(qb);
            //sessionにBeanをセットする
            session.setAttribute("qb",qb);
        }else if(qb == null) {
            //新しくBeanを生成する
            qb = new QRBean();
            //BeanのNoに値をセットする
            qb.setNo(Integer.parseInt(num));
            //Propertiesファイルのvalueを初期化するための配列を生成
            String[] valueString = new String[9];
            //配列のすべてにfalseを入れる
            Arrays.fill(valueString, "false");
            //Propertiesファイルに値をセットする
            EnterValue.newValueload(num ,valueString);
            //sessionにBeanをセットする
            session.setAttribute("qb",qb);
        }
    }
}