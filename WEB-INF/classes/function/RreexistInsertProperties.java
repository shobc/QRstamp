package function;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Iterator;
import java.io.IOException;
import java.util.Enumeration;
import java.io.FileInputStream;
import java.io.FileOutputStream;

//tomcat���_�E�������Ƃ���z�肵�Ă��Ƃ��ƃt�@�C���ɂ���l��MAP�ɕێ����Ă���V�����l�ƌ��̒l������
public class RreexistInsertProperties{
    //properties�t�@�C���ɃA�N�Z�X���邽�߂�path
    private static String path = PathHolder.pathName+"ManyFile\\test.properties";
    //tomcat���N��������Ă΂�郁�\�b�h
    public static void newLoad(String newKey,String[] newValue){
        Properties props = new Properties();
        Map<String,String>_initializeProperties = new HashMap<String,String>();
        try{
            props.load(new FileInputStream(path));
            Enumeration en = props.propertyNames();
            while (en.hasMoreElements()) {
                String key = (String) en.nextElement();
                String value = props.getProperty(key);
                _initializeProperties.put(key,value);
            }
            //key�ƕ����������
            //path����properties�t�@�C�����擾���ۑ�����
            for(String keys : _initializeProperties.keySet()){
                String value = props.getProperty(keys);
                System.out.println(keys+value);
                props.setProperty(keys,value);
//                props.store(new FileOutputStream(path), "Comments");
            }
            //�z��𕶎���ɕϊ�����
            String judge = String.join(",", newValue);
            props.setProperty(newKey,judge);
            props.store(new FileOutputStream(path), "Comments");
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}