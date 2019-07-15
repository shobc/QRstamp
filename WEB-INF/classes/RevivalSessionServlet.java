import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Authentication.RevivalgetSession;
import function.PathHolder;

public class RevivalSessionServlet extends HttpServlet{
    public void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException{
        //�p�����[�^����̒l���擾�i���̒l��cookie�ł̃��[�U�[���{��session�Ŏ��l�j
        String sessionNum = req.getParameter("sessionNum");
        //�����񂩂�int�^�ɕϊ�
        int num = Integer.parseInt(sessionNum);
        //�^����ꂽ���z�p�X�ɑΉ�������ۂ̃p�X�itomcat���_�E�����Ă���̏��߂Ă̎擾�j
        PathHolder.pathName = getServletContext().getRealPath("/");
        //session�̕��������邽�߂̃N���X
        RevivalgetSession reSession = new RevivalgetSession();
        reSession.getSession(num,req,res);
        //Access.html�Ƀ_�C���N�g�ɃA�N�Z�X
        res.sendRedirect("Access.html");
    }
}