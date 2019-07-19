package function;

import javax.servlet.http.HttpSession;

import Bean.QRBean;
import InsertData.EnterValue;

//全てのスタンプが押されたかの判定
public class ConfirmJudge{
    public void Judge(QRBean qb,HttpSession session,String Confirm){
        //Beanからすべての値を取得する
        String[] Department=qb.getJudgement();
        //trueの数を判定するための変数
        int j=0;
        //配列分ループ処理
        for(int i=0;i<9;i++){
            System.out.println(Department[i]);
            //booleanに変換してif文で判定する
            boolean boo = Boolean.valueOf(Department[i]);
            //trueか判定をする
            if(boo){
                j++;
            }
        }
        //trueが8個あるか判定し、カード交換に済みをつける
        if(j==8){
            //Beanに値をセットする
            DepartmentJudge dj = new DepartmentJudge();
            dj.judge(Confirm,qb);
            //Beanの値をPropertiesファイルに入れる
            EnterValue.Valueload(qb);
            //sessionでカード交換のボタンをなくす値を入れる
            session.setAttribute("judge","false");
        }else if(j==9){
            session.setAttribute("judge","OK");
        }
        //sessionにBeanをセットする
        session.setAttribute("qb",qb);
    }
}