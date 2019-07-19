package function;

import Bean.QRBean;
import javax.servlet.http.HttpSession;

//カード交換での判定
public class CardAchieved{
    public void Judge(HttpSession session,QRBean qb){
        //Beanからすべての値を取得する
        String[] Department=qb.getJudgement();
        //trueの数を判定するための変数
        int j=0;
        //配列分ループ処理
        for(int i=0;i<9;i++){
            //booleanに変換してif文で判定する
            boolean boo = Boolean.valueOf(Department[i]);
            if(boo){
                j++;
            }
        }
        //trueかfalseでスタンプ画面の確認ボタンが表示されるか判定される
        if(j==8){
            session.setAttribute("judge","true");
        }else{
            session.setAttribute("judge","false");
        }
    }
}