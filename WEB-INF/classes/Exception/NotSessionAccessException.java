package Exception;

//session���Ȃ��̂ɃA�N�Z�X�����Ƃ��ɔ��������O�N���X
public class NotSessionAccessException extends RuntimeException{
    public NotSessionAccessException(String mess){
        super(mess);
    }
    public NotSessionAccessException(String mess,Throwable t){
        super(mess,t);
    }
}