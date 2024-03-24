package myWallet.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import myWallet.DAO.HomePageDAO;

@WebServlet("/WalletHomePageServlet")
public class WalletHomePageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String userName = request.getParameter("userName");
		
		String buttonValue = request.getParameter("buttonValue");
		
		request.setAttribute("userName", userName);
		
		
//		if ( buttonValue.equalsIgnoreCase("profileButton") ) {
//			
//			HomePageDAO.display(userName);
//			
//			request.getRequestDispatcher("newRecord.jsp").forward(request, response);
//		}
		
		/*else*/ if ( buttonValue.equalsIgnoreCase("recordsButton") ) {
			
			request.getRequestDispatcher("records.jsp").forward(request, response);
		}
		
		else if ( buttonValue.equalsIgnoreCase("newRecordButton") ) {
			
			request.getRequestDispatcher("newRecord.jsp").forward(request, response);
		}
		
	}

}
