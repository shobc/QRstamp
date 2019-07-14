package function;

import java.util.Properties;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileOutputStream;


public class Factory{
    //propertiesをインスタンス化
    private static Properties prop = new Properties();
    //propertiesファイルまでのパスを取得
    private static String path = PathHolder.pathName+"ManyFile\\test.properties";
    //publicな引数のないコンストラクタ
    private Factory(){}
    //propertiesファイルを読み込むためのメソッド
    public static String[] read(String key){
        //判定を取得する変数
        String[] judgement = null;
        try{
            System.out.println("なんの表示だ？ｗ"+System.getProperty("java.class.path"));
            //pathからpropertiesファイルをロードする
            prop.load(new FileInputStream(path));
            //keyを頼りに文字列を取得する
            String value = prop.getProperty(key);
            //文字列を配列に変換する
            judgement = value.split(",");

        }catch(IOException e){
            e.printStackTrace();
        }
        //取得した配列を返す
        return judgement;
    }
    //propertiesファイルに値を入れるメソッド
    public static void load(String key,String[] judgement){
        try{
            //配列を文字列に変換する
            String judge = String.join(",", judgement);
            //keyと文字列を入れる
            prop.setProperty(key,judge);
            //pathからpropertiesファイルを取得し保存する
            prop.store(new FileOutputStream(path), "Comments");

        }catch(IOException e){
            e.printStackTrace();
        }
    }
}