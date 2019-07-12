package InsertData;
import Bean.QRBean;
import function.Factory;

public class EnterValue{
    public static void getValue(QRBean qb){
        String[] judge = Factory.read(String.valueOf(qb.getNo()));

        for(int i=0;i<judge.length;i++){
            qb.setJudgement(judge[i],i);
        }
    }
    public static void Valueload(QRBean qb){
        Factory.load(String.valueOf(qb.getNo()),qb.getJudgement());
    }
    public static void newValueload(String count,String[] value){
        Factory.load(count,value);
    }
}