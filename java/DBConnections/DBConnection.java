package myWallet.DBConnections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	
	public static Connection DBConnect() {
		
		Connection connection = null;
		
		String dbName = "jdbc:postgresql://localhost/My_Wallet";

		String dbDriver = "org.postgresql.Driver";

		String userName = "postgres";

		String password = "Hemanth@09";
		
		try {
			
			Class.forName(dbDriver);

			connection = DriverManager.getConnection(dbName, userName, password);
			
		}
		catch( SQLException | ClassNotFoundException e){

			System.out.println("Not Connected");

		}
		
		return connection;
	}

}
