package function;

import javax.servlet.http.HttpServletRequest;

import Bean.QRBean;
import InsertData.EnterValue;

//���[�U�[��session�������Ă���̂����肷��N���X
public class SessionJudge{
    public static QRBean judge(QRBean qb,HttpServletRequest req){
        //Bean�ɒl�����邩�m�F
        if(qb==null){
            //IP�A�h���X���擾
            String num = req.getRemoteAddr();
            //Bean��new����
            qb = new QRBean();
            //Bean�ɒl���Z�b�g����
            SessionSet sessionSet = new SessionSet();
            sessionSet.setValue(num,qb);
            //Bean��Ԃ�
            return qb;
        }
        //Bean�ɒl���Z�b�g����N���X
        EnterValue.getValue(qb);
        //Bean��Ԃ�
        return qb;
    }
}