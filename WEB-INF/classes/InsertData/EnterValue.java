package InsertData;
import Bean.QRBean;
import function.Factory;
import function.RreexistInsertProperties;

//Factory�N���X�֒l�̕ۑ��Ǝ擾������N���X
public class EnterValue{
    //properties�t�@�C������l���擾��Bean�ɃZ�b�g���郁�\�b�h
    public static void getValue(QRBean qb){
        //�z��Ŏ擾
        String[] judge = Factory.read(String.valueOf(qb.getNo()));
        //�e�w�Ȃɍ����悤��Bean�ɓ����
        for(int i=0;i<judge.length;i++){
            qb.setJudgement(judge[i],i);
        }
    }
    //��Ӑ��̂���l�Ɣz������郁�\�b�h
    public static void Valueload(QRBean qb){
        Factory.load(String.valueOf(qb.getNo()),qb.getJudgement());
    }
    //���߂ăA�N�Z�X�����ꍇ���Atomcat���_�E�������Ƃ��ɃA�N�Z�X���郁�\�b�h
    public static void newValueload(String count,String[] value){
        RreexistInsertProperties.newLoad(count,value);
    }
}