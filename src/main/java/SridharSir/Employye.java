package SridharSir;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Employye {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/emp","root","root");
//		PreparedStatement preparedStatement= connection .prepareStatement("create table emptab(id int, name varchar(20), salary integer)");
		PreparedStatement preparedStatement= connection .prepareStatement("insert into emptab values(142,'yash',2020);");
		int b=preparedStatement.executeUpdate();
		connection.close();
		System.out.println(" task completed");
	}
}

