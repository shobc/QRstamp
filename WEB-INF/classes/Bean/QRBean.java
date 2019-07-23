package Bean;

import java.io.Serializable;

//Beanとして利用されるクラス
public class QRBean implements Serializable{
    //一意性の番号を保持するためのデータ型
    private String no;
    //各学科の保持するための配列
    private String[] judgement = new String[9];
    //publicの引数のないコンストラクタを定義
    public QRBean(){}
    //番号を取得する
    public String getNo() {
        return no;
    }
    //番号をセットする
    public void setNo(String no) {
        this.no = no;
    }
    //配列全てを取得する
    public String[] getJudgement() {
        return judgement;
    }
    //各学科の値をセットする
    public void setJudgement(String judgement,int index) {
        this.judgement[index] = judgement;
    }
}