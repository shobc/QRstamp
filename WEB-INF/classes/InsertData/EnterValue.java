package InsertData;
import Bean.QRBean;
import function.Factory;

public class EnterValue{
    public static QRBean getValue(String count){
        String[] judge = Factory.read(count);

        QRBean qb = new QRBean();
        for(int i=0;i<judge.length;i++){
            qb.setJudgement(judge[i],i);
        }
        return qb;
    }
    public static void Valueload(String count,QRBean qb){
        String[] value = qb.getJudgement();
        Factory.load(count,value);
    }
    public static void newValueload(String count,String[] value){
        Factory.load(count,value);
    }
}