package myWallet.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import myWallet.DAO.*;

@WebServlet("/SignInServlet")
public class SignInServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String email = request.getParameter("email");
		
		String userName = email.split("@")[0];
		
		boolean tableCount = SignInDAO.createTable(userName);
		
		PrintWriter printWriter = response.getWriter();
		
		request.setAttribute("userName", userName);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("./walletHomePage.jsp");
		
		
		if ( tableCount ) {
			dispatcher.forward(request, response);
		} 
		else {
			printWriter.println("User not Found");
		}
		
	}

}
