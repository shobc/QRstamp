package InsertData;
import Bean.QRBean;
import function.Factory;
import function.RreexistInsertProperties;

//Factoryクラスへ値の保存と取得をするクラス
public class EnterValue{
    //propertiesファイルから値を取得しBeanにセットするメソッド
    public static void getValue(QRBean qb){
        //配列で取得
        String[] judge = Factory.read(String.valueOf(qb.getNo()));
        //各学科に合うようにBeanに入れる
        for(int i=0;i<judge.length;i++){
            qb.setJudgement(judge[i],i);
        }
    }
    //一意性のある値と配列を入れるメソッド
    public static void Valueload(QRBean qb){
        Factory.load(String.valueOf(qb.getNo()),qb.getJudgement());
    }
    //初めてアクセスした場合か、tomcatがダウンしたときにアクセスするメソッド
    public static void newValueload(String count,String[] value){
        RreexistInsertProperties.newLoad(count,value);
    }
}