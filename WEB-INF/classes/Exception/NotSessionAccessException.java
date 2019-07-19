package Exception;

//sessionがないのにアクセスしたときに発生する例外クラス
public class NotSessionAccessException extends RuntimeException{
    public NotSessionAccessException(String mess){
        super(mess);
    }
    public NotSessionAccessException(String mess,Throwable t){
        super(mess,t);
    }
}