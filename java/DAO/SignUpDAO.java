package myWallet.DAO;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import myWallet.DBConnections.*;

public class SignUpDAO {
	
	public static int createTable( String userName ) {
		
		int tableStatus = 0;
		
		ResultSet rs = null;
		
		try ( Connection conn = DBConnection.DBConnect() ) {
			
			Statement stmt = conn.createStatement();
			
			String tableName = userName;
            String query = "SELECT EXISTS (SELECT 1 FROM information_schema.tables WHERE table_name = '" + tableName + "')";

            // Execute the query
            rs = stmt.executeQuery(query);

            // Process the result
            if (rs.next()) {
            	
                boolean tableExists = rs.getBoolean(1);
                
                if (tableExists) {
                	
                	 tableStatus = -1;          	
                } 
                
                else {
                   
                	String createTableQuery = "CREATE TABLE public." + userName + " (price DOUBLE PRECISION NOT NULL, description CHARACTER VARYING NOT NULL, payment_date DATE NOT NULL, payment_time CHARACTER VARYING NOT NULL, payement_type CHARACTER VARYING NOT NULL, category CHARACTER VARYING NOT NULL, payment_recipt BYTEA NOT NULL)";
        	        
        	        tableStatus = stmt.executeUpdate(createTableQuery);
                }
            }
	    } 
		
		catch (SQLException e) {
	            e.printStackTrace();
	    }
		
		return tableStatus;
	}

}
