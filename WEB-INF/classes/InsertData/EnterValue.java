package InsertData;
import Bean.QRBean;
import function.Factory;

public class EnterValue{
    public static QRBean getValue(){
        String[] judge = Factory.read("1");

        QRBean qb = new QRBean();
        for(int i=0;i<judge.length;i++){
            qb.setJudgement(judge[i],i);
        }
        return qb;
    }
    public static void Valueload(QRBean qb){
        String[] value = qb.getJudgement();
        Factory.load("1",value);
    }
}