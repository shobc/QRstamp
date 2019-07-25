package function;

import java.net.InetAddress;
import java.net.UnknownHostException;

import Exception.NotSessionAccessException;
//�w�Z��wifi�ŃA�N�Z�X�����ꍇ��O��f���N���X
public class CutWifi{
    public static void Judge(){
        try{
            //�T�[�o�[��IP�A�h���X���擾
            InetAddress addr = InetAddress.getLocalHost();
            //�w�Z��IP�A�h���X����172�Ŕ��肷��
            if(addr.getHostAddress().startsWith("172")){
                throw new NotSessionAccessException("Wi-Fi��؂��Ă�������");
            }
        }catch(UnknownHostException e){
            throw new NotSessionAccessException("Wi-Fi��؂��Ă�������");
        }
    }
}