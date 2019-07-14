import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Cookie;

public class RevivalSessionAccessServlet extends HttpServlet{
    public void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException{
        // �N�b�L�[�̔z����擾
        Cookie cookie[] = req.getCookies();
        //�N�b�L�[�����邩�̔���
        if (cookie != null){
            //�N�b�L�[�̐��������[�v����
            for (int i = 0 ; i < cookie.length ; i++){
                //�擾�������l�ƍ����Ă��邩�̔���
                if (cookie[i].getName().equals("SessionNumber")){
                    String number= cookie[i].getValue();
                    req.setAttribute("number",number);
                }
            }
        }
        RequestDispatcher dis = req.getRequestDispatcher("/RevivalSession");
        dis.forward(req,res);
    }
}