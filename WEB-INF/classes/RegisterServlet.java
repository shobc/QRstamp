import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.ServletContext;





import java.net.InetAddress;
import java.net.UnknownHostException;






import Authentication.InsertSession;
import function.PathHolder;

//�o�^�p�̃T�[�u���b�g
public class RegisterServlet extends HttpServlet{
    public void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException{



        try {
            InetAddress addr = InetAddress.getLocalHost();
            InetAddress addr2 = InetAddress.getLocalHost();
            if (addr.equals(addr2)) System.out.println("addr��addr2�͓����C���X�^���X");
            System.out.println("Local Host Name: " + addr.getHostName());
            System.out.println("IP Address     : " + addr.getHostAddress());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }





        //�^����ꂽ���z�p�X�ɑΉ�������ۂ̃p�X
        PathHolder.pathName = getServletContext().getRealPath("/");
        //�e�[���ɃZ�b�V�����Ɉ�Ӑ��̔ԍ����������邽�߂̃N���X
        InsertSession is = new InsertSession();
        is.setSession(req);
        //Access.html�Ƀ_�C���N�g�ɃA�N�Z�X
        res.sendRedirect("Access.html");
    }
}