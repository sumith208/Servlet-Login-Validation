package Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.Dao;
//import Dto.Dto;
import Dto.Registration;
@WebServlet("/register")
public class Controller extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doPost(req, resp);
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		String phno = req.getParameter("phno");
		
		Long phno1 = Long.parseLong(phno);
		
		Registration dto = new Registration();
		dto.setName(name);
		dto.setEmail(email);
		dto.setPassword(password);
		dto.setPhone_Number(phno1);
		
		Dao dao = new Dao();
		String msg = dao.insert(dto);
		resp.getWriter().print(msg);
		
		
	}
	

}
