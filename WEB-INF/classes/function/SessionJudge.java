package function;

import Bean.QRBean;
import InsertData.EnterValue;

import javax.servlet.http.Cookie;

public class SessionJudge{
    public void Judge(Cookie[] cookie,QRBean qb){
        if (cookie != null){
            //�N�b�L�[�̐��������[�v����
            for (int i = 0 ; i < cookie.length ; i++){
                //�擾�������l�ƍ����Ă��邩�̔���
                if (cookie[i].getName().equals("SessionNumber")){
                    String number= cookie[i].getValue();
                    qb.setNo(Integer.parseInt(number));
                }
            }
        }
        //Bean�ɒl���Z�b�g����N���X
        EnterValue.getValue(qb);
    }
}