package Bean;
import java.io.Serializable;

public class QRBean implements Serializable{
    private String[] judgement = new String[9];
    private int no;
    public QRBean(){}
    public int getNo() {
        return no;
    }
    public void setNo(int no) {
        this.no = no;
    }
    public void setJudgement(String judgement,int index) {
        this.judgement[index] = judgement;
    }
    public String[] getJudgement() {
        return judgement;
    }
}