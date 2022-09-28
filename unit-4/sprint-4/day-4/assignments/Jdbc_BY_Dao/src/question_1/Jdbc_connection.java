package question_1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Jdbc_connection {
	
	String driverClassName="com.mysql.cj.jdbc.Driver";
	static String connectionUrl="jdbc:mysql://localhost:3306/db3";
	static String userPass="root";
	static String userId="root";
	
	private static Jdbc_connection FactoryConnection=null;
	
	private Jdbc_connection() {
		try {
			Class.forName(driverClassName);
			
		} catch (ClassNotFoundException cnf) {
			cnf.printStackTrace();
		}
	}
	
	public Connection connn() throws SQLException {
		Connection con=null;
		con=DriverManager.getConnection(connectionUrl,userId,userPass);
		return con;
	}
	
	public static Jdbc_connection getInstance() {
		if (FactoryConnection==null) {
			FactoryConnection=new Jdbc_connection();
		}
		return FactoryConnection;
	}
	
}
