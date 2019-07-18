package function;

import java.util.Properties;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileOutputStream;
import java.util.Enumeration;


public class Factory{
    //properties���C���X�^���X��
    private static Properties prop = new Properties();
    //properties�t�@�C���܂ł̃p�X���擾
    private static String path = PathHolder.pathName+"ManyFile\\test.properties";
    //public�Ȉ����̂Ȃ��R���X�g���N�^
    private Factory(){}
    //properties�t�@�C����ǂݍ��ނ��߂̃��\�b�h
    public static String[] read(String key){
        //������擾����ϐ�
        String[] judgement = null;
        try{
            System.out.println("Factory��key"+key);
            System.out.println("Factory��path"+path);
            System.out.println("�Ȃ�̕\�����H��"+System.getProperty("java.class.path"));
            //path����properties�t�@�C�������[�h����
            prop.load(new FileInputStream(path));
            //key�𗊂�ɕ�������擾����
            String value = prop.getProperty(key);
            //�������z��ɕϊ�����
            System.out.println("value"+value);
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
    public static int getMaxKeyCount(){
        int maxKeyNum = 0;
        Properties props = new Properties();
        try {
            props.load(new FileInputStream(path));

            Enumeration en = props.propertyNames();
            while (en.hasMoreElements()) {
                String key = (String) en.nextElement();
                int keynum = Integer.parseInt(key);
                System.out.println("while���[�v�̒��ł̏o��"+keynum);
                if(maxKeyNum<=keynum){
                    maxKeyNum=keynum;
                }
            }
            System.out.println("��ԑ傫���l"+maxKeyNum);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return maxKeyNum;
    }
}