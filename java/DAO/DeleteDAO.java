package myWallet.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import myWallet.DBConnections.DBConnection;
import myWallet.entities.Wallet;

public class DeleteDAO {
	
	public static boolean deleteRecord( Wallet wallet , String userName ) {
		
		Connection connection = null;
		
		PreparedStatement ps = null;
		
//		ResultSet rs = null;
		
		boolean result = false;
		
		try {
		
			connection = DBConnection.DBConnect();
		
//			String sql = "SELECT CASE WHEN COUNT(*) > 0 THEN TRUE ELSE FALSE END AS result FROM " +  userName + " WHERE (price, description, payment_date, payment_time, payement_type, category) = (?, ?, ?, ?, ?, ?)";
	        
			String sql = "DELETE FROM " +  userName + " WHERE price = ? AND description = ? AND  payment_time = ? AND payement_type = ? AND category = ?";
			
			ps = connection.prepareStatement(sql);
			
	        ps.setDouble(1 , wallet.getPrice());
			ps.setString(2, wallet.getDescription());
//			ps.setDate(3, wallet.getPaymentDate());
			ps.setString(3, wallet.getPaymentTime());
			ps.setString(4, wallet.getPaymentType());
			ps.setString(5, wallet.getCategory());
				
//			rs = ps.executeQuery();
			
			int count = ps.executeUpdate();
			
			if ( count >= 1 ) {
				result = true;
			}
			
			
//	        if (rs.next()) {
//	            result = rs.getBoolean(1);
//	        }
        	
			
		}catch(SQLException s) {
			
			s.printStackTrace();
			
		}finally {
			
			try {
				if(connection!=null && ps!=null) {
				connection.close();
				ps.close();
				}
			}
			catch(SQLException s) {
				s.printStackTrace();
			}
		}
		
		
		return result;
		
	}

}
