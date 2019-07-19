package Authentication;

import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;

import InsertData.EnterValue;
import Bean.QRBean;
import function.PropertiesKeyJudge;
//session��Bean����������N���X
public class InsertSession {
    private QRBean qb;
    public void setSession(HttpServletRequest req){
        //session���擾����
        HttpSession session = req.getSession();
        //session�̒�����Bean���擾����
        qb = (QRBean) session.getAttribute("qb");
        //IP�A�h���X���擾����.���󔒂Ɠ���ւ���String�^�ɑ������
        String num = req.getRemoteAddr().replace(".","");
        //IP�A�h���X��Properties�t�@�C���ɓ����Ă��邩���肷��
        if(PropertiesKeyJudge.judge(num)){
            //�V����Bean�𐶐�
            qb = new QRBean();
            //Bean��No�ɒl���Z�b�g����
            qb.setNo(Integer.parseInt(num));
            //Properties�t�@�C������Bean�ɒl���Z�b�g����
            EnterValue.getValue(qb);
            //session��Bean���Z�b�g����
            session.setAttribute("qb",qb);
        }else if(qb == null) {
            //�V����Bean�𐶐�����
            qb = new QRBean();
            //Bean��No�ɒl���Z�b�g����
            qb.setNo(Integer.parseInt(num));
            //Properties�t�@�C����value�����������邽�߂̔z��𐶐�
            String[] valueString = new String[9];
            //�z��̂��ׂĂ�false������
            Arrays.fill(valueString, "false");
            //Properties�t�@�C���ɒl���Z�b�g����
            EnterValue.newValueload(num ,valueString);
            //session��Bean���Z�b�g����
            session.setAttribute("qb",qb);
        }
    }
}