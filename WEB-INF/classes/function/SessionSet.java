package function;

import Bean.QRBean;
import Exception.NotSessionAccessException;
import InsertData.EnterValue;

//Properties�t�@�C���ɓ����Ă���key��IP�A�h���X����v���邩�m�F����N���X
public class SessionSet {
    public void setValue(String num,QRBean qb){
        //IP�A�h���X�ɂ��Ă���.����菜��
        num = num.replace(".","");
        //Properties�ɓ���IP�A�h���X�̒l�����邩���������
        if(Factory.getKeyJudge(num)){
            //IP�A�h���X��Bean��No��set����
            qb.setNo(num);
            //Bean�ɒl���Z�b�g����N���X
            EnterValue.getValue(qb);
        }else{//�Ȃ������ꍇ��O���X���[���ė�O�y�[�W�ɍs��
            System.out.println("session��ێ����Ă��Ȃ��̂ŗ�O�𔭐�������");
            //�Ǝ���O���g�p���ăX���[����
            throw new NotSessionAccessException("��t��QR��ǂݍ���ł�������");
        }
    }
}