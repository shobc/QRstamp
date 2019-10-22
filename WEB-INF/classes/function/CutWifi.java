package function;

import javax.servlet.http.HttpServletRequest;

import Exception.NotSessionAccessException;
//学校のwifiでアクセスした場合例外を吐くクラス
public class CutWifi{
    public static void Judge(HttpServletRequest req){
//        try{
            //端末のIPアドレスを取得する
            System.out.println(req.getRemoteAddr());
            //学校のIPアドレスか判定する
            if(req.getRemoteAddr().startsWith("118.238.210.244")){
                System.out.println("wifiでアクセスされた");
                throw new NotSessionAccessException("Wi-Fiを切ってください");
            }
    }
}