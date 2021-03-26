package ZJC.servlet;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html");
        //解析数据
        String un=req.getParameter("username");
        String pwd=req.getParameter("password");
        System.out.printf("用户名(%s) 密码(%s) /n",un,pwd);
        //返回响应数据
        PrintWriter ret=resp.getWriter();
        ret.println("登陆成功");
        ret.println(un);
        ret.println(pwd);
        ret.flush();
        ret.close();
    }
}
