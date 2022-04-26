package PresentationControl;


import DatabaseAccessObject.MyBatisUtil;
import mapper.UserMapper;
import org.apache.ibatis.session.SqlSession;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


//服务路径
@WebServlet("/UserLogin")


public class UserLogin extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //get user input
        String account = request.getParameter("userAccount");
        String password = request.getParameter("password");

        SqlSession session = MyBatisUtil.getSession();
        UserMapper mapper = session.getMapper(UserMapper.class);


    }


}
