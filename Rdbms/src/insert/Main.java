package insert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Main {

	public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1" , "root" , "" );
		
		PreparedStatement preparedStatement = connection.prepareStatement("insert into info values(? , ?)");
		
		preparedStatement.setInt(1, 2);
		preparedStatement.setString(2, "gesfsdh");
		
		preparedStatement.executeUpdate();
		
		System.out.println("Inserted...");
		
		connection.close();
		
	}
	
}
