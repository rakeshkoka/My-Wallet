package myWallet.DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

import myWallet.DBConnections.DBConnection;
import myWallet.entities.*;

public class HomePageDAO {
	
	public static List<Wallet> display( String userName ) {
		
		List<Wallet> records = new LinkedList<>();
		
		try(Connection connection = DBConnection.DBConnect();
				Statement statement = connection.createStatement()) {
				
				ResultSet resultSet = statement.executeQuery("Select * from public." + userName );
				
				while(resultSet.next()) {
									
					records.add(new Wallet( resultSet.getDouble(1) , resultSet.getString(2) , resultSet.getDate(3) , resultSet.getString(4) , resultSet.getString(5) , resultSet.getString(6) , resultSet.getBytes(7) ));                                                                
				}
				
			}
			catch(SQLException se) {
				se.printStackTrace();
			}
		
		return records;
		
	}

}
