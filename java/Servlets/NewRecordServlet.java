package myWallet.servlets;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import org.apache.commons.io.IOUtils;

import myWallet.entities.*;
import myWallet.DAO.*;

@WebServlet("/NewRecordServlet")
@MultipartConfig
public class NewRecordServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		double price = Double.parseDouble(request.getParameter("price"));
		
		String description = request.getParameter("description");
		
		Date paymentDate = Date.valueOf(request.getParameter("dateInput"));
        
		String payementTime = request.getParameter("timeInput");
        
        String paymentType = request.getParameter("paymentType");
        
        String categoryChoice = request.getParameter("category");

        // Get the selected option for the selected category
        String category = request.getParameter(categoryChoice + "Option");
        
        Part part = request.getPart("picture");
        
		InputStream inputStream = part.getInputStream();
		
		byte[] paymentRecipt = IOUtils.toByteArray(inputStream);
        
        String userName = request.getParameter("userName");
        
        Wallet wallet = new Wallet(price, description, paymentDate, payementTime, paymentType, category,paymentRecipt);
        
        int rowCount = NewRecordDAO.addNewRecord(wallet,userName);
        
        request.setAttribute("userName", userName);
        
        if ( rowCount == 1 ) {
        	request.getRequestDispatcher("walletHomePage.jsp").forward(request, response);
        } else {
        	PrintWriter printWriter = response.getWriter();
        	printWriter.println("Could not insert");
        }
        
        
        
        

        
        
        
        
        
        
        
        
		
	}

}
