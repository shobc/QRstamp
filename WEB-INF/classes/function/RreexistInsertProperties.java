package function;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.io.IOException;
import java.util.Enumeration;
import java.io.FileInputStream;
import java.io.FileOutputStream;

//tomcatが起動してから新規のユーザがアクセスしたとき、
// 中のデータがすべて初期化されるので
// もともとファイルにある値をMAPに保持してから新しい値と元の値を入れる
public class RreexistInsertProperties{
    //propertiesファイルにアクセスするためのpath
    private static String path = PathHolder.pathName+"ManyFile\\test.properties";
    //tomcatが起動したら呼ばれるメソッド
    public static void newLoad(String newKey,String[] newValue){
        //Propertiesをnewする
        Properties prop = new Properties();
        //Propertiesファイルにある値をMAPに入れる
        Map<String,String>_initializeProperties = new HashMap<String,String>();
        try{
            //指定したファイルをロードする
            prop.load(new FileInputStream(path));
            //Enumerationを使用して値を取得
            Enumeration en = prop.propertyNames();
            while (en.hasMoreElements()) {
                String key = (String) en.nextElement();
                String value = prop.getProperty(key);
                _initializeProperties.put(key,value);
            }
            //keyと文字列を入れる
            //pathからpropertiesファイルを取得し保存する
            for(String keys : _initializeProperties.keySet()){
                String value = prop.getProperty(keys);
                System.out.println(keys+value);
                prop.setProperty(keys,value);
            }
            //配列を文字列に変換する
            String judge = String.join(",", newValue);
            prop.setProperty(newKey,judge);
            prop.store(new FileOutputStream(path), "Comments");
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}