package function;

import Bean.QRBean;
import Exception.NotSessionAccessException;
import InsertData.EnterValue;

//Propertiesファイルに入っているkeyとIPアドレスが一致するか確認するクラス
public class SessionSet {
    public void setValue(String num,QRBean qb){
        //IPアドレスについている.を取り除く
        num = num.replace(".","");
        //Propertiesに同じIPアドレスの値があるか判定をする
        if(Factory.getKeyJudge(num)){
            //IPアドレスをBeanのNoにsetする
            qb.setNo(num);
            //Beanに値をセットするクラス
            EnterValue.getValue(qb);
        }else{//なかった場合例外をスローして例外ページに行く
            System.out.println("sessionを保持していないので例外を発生させる");
            //独自例外を使用してスローする
            throw new NotSessionAccessException("受付でQRを読み込んでください");
        }
    }
}