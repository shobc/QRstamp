package function;

import Bean.QRBean;
import InsertData.EnterValue;

public class SessionSet {
    public void setValue(String num,QRBean qb){
        //IP�A�h���X��.����ɕς��Ă���Int�^�ɕς���Bean��set����
        qb.setNo(Integer.parseInt(num.replace(".","")));
        //Bean�ɒl���Z�b�g����N���X
        EnterValue.getValue(qb);
    }
}