package function;

import Bean.QRBean;
import javax.servlet.http.HttpSession;

//�J�[�h�����ł̔���
public class CardAchieved{
    public void Judge(HttpSession session,QRBean qb){
        //Bean���炷�ׂĂ̒l���擾����
        String[] Department=qb.getJudgement();
        //true�̐��𔻒肷�邽�߂̕ϐ�
        int j=0;
        //�z�񕪃��[�v����
        for(int i=0;i<9;i++){
            //boolean�ɕϊ�����if���Ŕ��肷��
            boolean boo = Boolean.valueOf(Department[i]);
            if(boo){
                j++;
            }
        }
        //true��false�ŃX�^���v��ʂ̊m�F�{�^�����\������邩���肳���
        if(j==8){
            session.setAttribute("judge","true");
        }else{
            session.setAttribute("judge","false");
        }
    }
}