package myWallet.DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import myWallet.DBConnections.DBConnection;

public class SignInDAO {
	
	public static boolean createTable( String userName ) {
		
		boolean tableExists = false;
		
		ResultSet rs = null;
		
		try ( Connection conn = DBConnection.DBConnect() ) {
			
			Statement stmt = conn.createStatement();
			
			String tableName = userName;
            String query = "SELECT EXISTS (SELECT 1 FROM information_schema.tables WHERE table_name = '" + tableName + "')";

            // Execute the query
            rs = stmt.executeQuery(query);

            // Process the result
            if (rs.next()) {
            	
                tableExists = rs.getBoolean(1);
            }
	    } 
		
		catch (SQLException e) {
	            e.printStackTrace();
	    }
		
		return tableExists;
	}

}
