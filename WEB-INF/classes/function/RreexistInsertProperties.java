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
    //properties�t�@�C���ɃA�N�Z�X���邽�߂�path
    private static String path = PathHolder.pathName+"ManyFile\\test.properties";
    //tomcat���N��������Ă΂�郁�\�b�h
    public static void newLoad(String newKey,String[] newValue){
        //Properties��new����
        Properties prop = new Properties();
        //Properties�t�@�C���ɂ���l��MAP�ɓ����
        Map<String,String>_initializeProperties = new HashMap<String,String>();
        try{
            //�w�肵���t�@�C�������[�h����
            prop.load(new FileInputStream(path));
            //Enumeration���g�p���Ēl���擾
            Enumeration en = prop.propertyNames();
            while (en.hasMoreElements()) {
                String key = (String) en.nextElement();
                String value = prop.getProperty(key);
                _initializeProperties.put(key,value);
            }
            //key�ƕ����������
            //path����properties�t�@�C�����擾���ۑ�����
            for(String keys : _initializeProperties.keySet()){
                String value = prop.getProperty(keys);
                System.out.println(keys+value);
                prop.setProperty(keys,value);
            }
            //�z��𕶎���ɕϊ�����
            String judge = String.join(",", newValue);
            prop.setProperty(newKey,judge);
            prop.store(new FileOutputStream(path), "Comments");
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}