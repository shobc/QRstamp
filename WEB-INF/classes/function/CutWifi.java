package function;

import javax.servlet.http.HttpServletRequest;

import Exception.NotSessionAccessException;
//�w�Z��wifi�ŃA�N�Z�X�����ꍇ��O��f���N���X
public class CutWifi{
    public static void Judge(HttpServletRequest req){
//        try{
            //�[����IP�A�h���X���擾����
            System.out.println(req.getRemoteAddr());
            //�w�Z��IP�A�h���X�����肷��
            if(req.getRemoteAddr().startsWith("118.238.210.244")){
                System.out.println("wifi�ŃA�N�Z�X���ꂽ");
                throw new NotSessionAccessException("Wi-Fi��؂��Ă�������");
            }
    }
}