import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.ServletContext;

import Authentication.InsertSession;
import function.CutWifi;
import function.PathHolder;

//�o�^�p�̃T�[�u���b�g
public class RegisterServlet extends HttpServlet{
    public void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException{
        //�w�Z��wifi�ɐڑ�����Ă���ꍇ��O��f���N���X
        CutWifi.Judge(req);
        //�^����ꂽ���z�p�X�ɑΉ�������ۂ̃p�X
        PathHolder.pathName = getServletContext().getRealPath("/");
        //�e�[���ɃZ�b�V�����Ɉ�Ӑ��̔ԍ����������邽�߂̃N���X
        InsertSession is = new InsertSession();
        is.setSession(req);
        //Access.html�Ƀ_�C���N�g�ɃA�N�Z�X
        res.sendRedirect("stamp");
    }
}