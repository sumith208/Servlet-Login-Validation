package Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.Dao;

@WebServlet("/login")
public class Login extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doGet(req, resp);
		String email = req.getParameter("mail");
		String password = req.getParameter("pwd1");
//		String email = req.getParameter("email");
		Dao dao = new Dao();
		String msg = dao.fetch(email,password);
		resp.getWriter().print(msg);
	}
	

}
