package Bean;

import java.io.Serializable;

//Bean�Ƃ��ė��p�����N���X
public class QRBean implements Serializable{
    //��Ӑ��̔ԍ���ێ����邽�߂̃f�[�^�^
    private String no;
    //�e�w�Ȃ̕ێ����邽�߂̔z��
    private String[] judgement = new String[9];
    //public�̈����̂Ȃ��R���X�g���N�^���`
    public QRBean(){}
    //�ԍ����擾����
    public String getNo() {
        return no;
    }
    //�ԍ����Z�b�g����
    public void setNo(String no) {
        this.no = no;
    }
    //�z��S�Ă��擾����
    public String[] getJudgement() {
        return judgement;
    }
    //�e�w�Ȃ̒l���Z�b�g����
    public void setJudgement(String judgement,int index) {
        this.judgement[index] = judgement;
    }
}