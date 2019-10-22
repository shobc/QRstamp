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
    //tomcatが起動したら呼ばれるメソッド
    //同時にアクセスがあった場合整合性が合わない可能性があるのでsynchronizedを付与する
    public synchronized static void newLoad(String newKey,String[] newValue){
        String path = PathHolder.pathName+"ManyFile/test.properties";
        System.out.println("一番最初のpath"+path);
        //Propertiesをnewする
        Properties prop = new Properties();
        //Propertiesファイルにある値をMAPに入れる
        Map<String,String>_initializeProperties = new HashMap<String,String>();
        try{
            //指定したファイルをロードする
            prop.load(new FileInputStream(path));
            //Enumerationを使用して値を取得
            Enumeration en = prop.propertyNames();
            //Propertiesにある値の行だけ回す
            while (en.hasMoreElements()) {
                //keyの取得
                String key = (String) en.nextElement();
                //valueの取得
                String value = prop.getProperty(key);
                //Mapに値を入れる
                _initializeProperties.put(key,value);
            }
            //keyと文字列を入れる
            //pathからpropertiesファイルを取得し保存する
            for(String keys : _initializeProperties.keySet()){
                String value = prop.getProperty(keys);
                prop.setProperty(keys,value);
            }
            //新規の配列を文字列に変換する
            String judge = String.join(",", newValue);
            //新しいユーザの値を入れる
            prop.setProperty(newKey,judge);
            //保存をする
            prop.store(new FileOutputStream(path), "Comments");
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}