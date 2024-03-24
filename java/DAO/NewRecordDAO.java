package myWallet.DAO;

import myWallet.entities.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import myWallet.DBConnections.*;

public class NewRecordDAO {
	
	public static int addNewRecord( Wallet wallet , String userName ) {
		
		Connection connection = null;
		
		PreparedStatement ps = null;
		
		int count=0;
		
		try {
		
		connection = DBConnection.DBConnect();
		
		ps = connection.prepareStatement("insert into public." + userName + " values( ? , ? , ? , ? , ? , ? , ? )");
			
			ps.setDouble(1 , wallet.getPrice());
			ps.setString(2, wallet.getDescription());
			ps.setDate(3, wallet.getPaymentDate());
			ps.setString(4, wallet.getPaymentTime());
			ps.setString(5, wallet.getPaymentType());
			ps.setString(6, wallet.getCategory());
			ps.setBytes(7, wallet.getPaymentRecipt());
			
			count =  ps.executeUpdate();
			
			
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
		
		return count;
	}

}
