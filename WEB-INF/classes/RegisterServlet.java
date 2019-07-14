import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.ServletContext;

import Authentication.*;
import function.*;

public class RegisterServlet extends HttpServlet{
    public void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException{
        //�����R�[�h�̐ݒ�
        req.setCharacterEncoding("Windows-31J");
        //�^����ꂽ���z�p�X�ɑΉ�������ۂ̃p�X
        PathHolder.pathName = getServletContext().getRealPath("/");
        //contextScope�̎擾
        ServletContext context =getServletContext();
        //��Ӑ��̔ԍ��𐶐����邽�߃N���X���C���X�^���X��
        UserCount uc = new UserCount(context);
        //�e�[���ɃZ�b�V�����Ɉ�Ӑ��̔ԍ����������邽�߂̃N���X
        InsertSession is = new InsertSession(uc);
        is.setSession(req,res);
        //Access.html�Ƀ_�C���N�g�ɃA�N�Z�X
        res.sendRedirect("Access.html");
    }
}