package myWallet.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import myWallet.DAO.DeleteDAO;
import myWallet.entities.Wallet;

@WebServlet("/DeleteServlet")
public class DeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		double price = Double.parseDouble(request.getParameter("price"));
		
		String description = request.getParameter("description");
		
//		Date paymentDate = Date.valueOf(request.getParameter("paymentDate"));
        
		String payementTime = request.getParameter("paymentTime");
        
        String paymentType = request.getParameter("paymentType");

        String category = request.getParameter("category");
        
        String userName = request.getParameter("userName");
        
        Wallet wallet = new Wallet(price, description, payementTime, paymentType, category);
        
		boolean flag = DeleteDAO.deleteRecord(wallet, userName);
		
		PrintWriter printWriter = response.getWriter();
		
		printWriter.println("Result : " + flag);
		
		
	}

}
