package function;

import javax.servlet.http.HttpSession;

import Bean.QRBean;
import InsertData.EnterValue;

//�S�ẴX�^���v�������ꂽ���̔���
public class ConfirmJudge{
    public void Judge(QRBean qb,HttpSession session,String Confirm){
        //Bean���炷�ׂĂ̒l���擾����
        String[] Department=qb.getJudgement();
        //true�̐��𔻒肷�邽�߂̕ϐ�
        int j=0;
        //�z�񕪃��[�v����
        for(int i=0;i<9;i++){
            System.out.println(Department[i]);
            //boolean�ɕϊ�����if���Ŕ��肷��
            boolean boo = Boolean.valueOf(Department[i]);
            //true�����������
            if(boo){
                j++;
            }
        }
        //true��8���邩���肵�A�J�[�h�����ɍς݂�����
        if(j==8){
            //Bean�ɒl���Z�b�g����
            DepartmentJudge dj = new DepartmentJudge();
            dj.judge(Confirm,qb);
            //Bean�̒l��Properties�t�@�C���ɓ����
            EnterValue.Valueload(qb);
            //session�ŃJ�[�h�����̃{�^�����Ȃ����l������
            session.setAttribute("judge","false");
        }else if(j==9){
            session.setAttribute("judge","OK");
        }
        //session��Bean���Z�b�g����
        session.setAttribute("qb",qb);
    }
}