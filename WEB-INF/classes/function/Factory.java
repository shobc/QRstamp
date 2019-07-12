package function;

import java.util.Properties;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileOutputStream;


public class Factory{
    private static Properties prop = new Properties();
    private static String path = PathHolder.pathName+"ManyFile\\test.properties";
    private Factory(){}
    public static String[] read(String key){
        String[] judgement = null;
        try{
            System.out.println(System.getProperty("java.class.path"));
            prop.load(new FileInputStream(path));
            String value = prop.getProperty(key);
            judgement = value.split(",");

        }catch(IOException e){
            e.printStackTrace();
        }
        return judgement;
    }
    public static void load(String key,String[] judgement){
        try{
            String judge = String.join(",", judgement);
            prop.setProperty(key,judge);
            System.out.println(path);
            prop.store(new FileOutputStream(path), "Comments");
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}