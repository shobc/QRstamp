package function;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.io.IOException;
import java.util.Enumeration;
import java.io.FileInputStream;
import java.io.FileOutputStream;

//tomcat���N�����Ă���V�K�̃��[�U���A�N�Z�X�����Ƃ��A
// ���̃f�[�^�����ׂď����������̂�
// ���Ƃ��ƃt�@�C���ɂ���l��MAP�ɕێ����Ă���V�����l�ƌ��̒l������
public class RreexistInsertProperties{
    //tomcat���N��������Ă΂�郁�\�b�h
    //�����ɃA�N�Z�X���������ꍇ������������Ȃ��\��������̂�synchronized��t�^����
    public synchronized static void newLoad(String newKey,String[] newValue){
        String path = PathHolder.pathName+"ManyFile/test.properties";
        System.out.println("��ԍŏ���path"+path);
        //Properties��new����
        Properties prop = new Properties();
        //Properties�t�@�C���ɂ���l��MAP�ɓ����
        Map<String,String>_initializeProperties = new HashMap<String,String>();
        try{
            //�w�肵���t�@�C�������[�h����
            prop.load(new FileInputStream(path));
            //Enumeration���g�p���Ēl���擾
            Enumeration en = prop.propertyNames();
            //Properties�ɂ���l�̍s������
            while (en.hasMoreElements()) {
                //key�̎擾
                String key = (String) en.nextElement();
                //value�̎擾
                String value = prop.getProperty(key);
                //Map�ɒl������
                _initializeProperties.put(key,value);
            }
            //key�ƕ����������
            //path����properties�t�@�C�����擾���ۑ�����
            for(String keys : _initializeProperties.keySet()){
                String value = prop.getProperty(keys);
                prop.setProperty(keys,value);
            }
            //�V�K�̔z��𕶎���ɕϊ�����
            String judge = String.join(",", newValue);
            //�V�������[�U�̒l������
            prop.setProperty(newKey,judge);
            //�ۑ�������
            prop.store(new FileOutputStream(path), "Comments");
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}