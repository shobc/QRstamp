package function;

import java.net.InetAddress;
import java.net.UnknownHostException;

import Exception.NotSessionAccessException;
//学校のwifiでアクセスした場合例外を吐くクラス
public class CutWifi{
    public static void Judge(){
        try{
            //サーバーのIPアドレスを取得
            InetAddress addr = InetAddress.getLocalHost();
            //学校のIPアドレスかを172で判定する
            if(addr.getHostAddress().startsWith("172")){
                throw new NotSessionAccessException("Wi-Fiを切ってください");
            }
        }catch(UnknownHostException e){
            throw new NotSessionAccessException("Wi-Fiを切ってください");
        }
    }
}