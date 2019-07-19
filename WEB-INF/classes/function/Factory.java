package function;

import java.util.Properties;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Enumeration;


public class Factory{
    //properties���C���X�^���X��
    private static Properties prop = new Properties();
    private static String path = PathHolder.pathName+"ManyFile\\test.properties";
    //public�Ȉ����̂Ȃ��R���X�g���N�^
    private Factory(){}
    //properties�t�@�C����ǂݍ��ނ��߂̃��\�b�h
    public static String[] read(String key){
        //������擾����ϐ�
        String[] judgement = null;
        try{
            //path����properties�t�@�C�������[�h����
            prop.load(new FileInputStream(path));
            //key�𗊂�ɕ�������擾����
            String value = prop.getProperty(key);
            //�������z��ɕϊ�����
            judgement = value.split(",");

        }catch(IOException e){
            e.printStackTrace();
        }
        //�擾�����z���Ԃ�
        return judgement;
    }
    //properties�t�@�C���ɒl�����郁�\�b�h
    public static void load(String key,String[] judgement){
        try{
            //�z��𕶎���ɕϊ�����
            String judge = String.join(",", judgement);
            //key�ƕ����������
            prop.setProperty(key,judge);
            //path����properties�t�@�C�����擾���ۑ�����
            prop.store(new FileOutputStream(path), "Comments");

        }catch(IOException e){
            e.printStackTrace();
        }
    }
    //Properties�t�@�C���Ɉ�����number�ɊY������key�����邩boolean�Ŕ��������
    public static boolean getKeyJudge(String number){
        try {
            //Properties�t�@�C���̃��[�h����
            prop.load(new FileInputStream(path));
            //Enumeration�ōs�����擾����
            Enumeration en = prop.propertyNames();
            //�s�������[�v��������
            while (en.hasMoreElements()) {
                //key�̒l���擾����
                String key = (String) en.nextElement();
                //�������̒l��key�ƈ�v�Ȃ̂����肷��
               if(number.equals(key)){
                   //�ꏏ�������ꍇ�Atrue��Ԃ�
                   return true;
               }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        //�l����v���Ȃ������ꍇ�Afalse��Ԃ�
        return false;
    }
}