package function;

//propertiesファイルに値が入っているのか判定を返すクラス
public class PropertiesKeyJudge{
    public static boolean judge(String num){
        //booleanで値を返す
        return Factory.getKeyJudge(num);
    }
}