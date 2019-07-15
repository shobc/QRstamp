package function;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Iterator;
import java.io.IOException;
import java.util.Enumeration;
import java.io.FileInputStream;
import java.io.FileOutputStream;

//tomcatがダウンしたときを想定してもともとファイルにある値をMAPに保持してから新しい値と元の値を入れる
public class RreexistInsertProperties{
    //propertiesファイルにアクセスするためのpath
    private static String path = PathHolder.pathName+"ManyFile\\test.properties";
    //tomcatが起動したら呼ばれるメソッド
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
            //keyと文字列を入れる
            //pathからpropertiesファイルを取得し保存する
            for(String keys : _initializeProperties.keySet()){
                String value = props.getProperty(keys);
                System.out.println(keys+value);
                props.setProperty(keys,value);
//                props.store(new FileOutputStream(path), "Comments");
            }
            //配列を文字列に変換する
            String judge = String.join(",", newValue);
            props.setProperty(newKey,judge);
            props.store(new FileOutputStream(path), "Comments");
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}