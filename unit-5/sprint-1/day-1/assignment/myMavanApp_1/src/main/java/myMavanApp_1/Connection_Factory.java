package myMavanApp_1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class Connection_Factory {
	
	String driverClassName="com.mysql.cj.jdbc.Driver";
	static String connectionUrl="jdbc:mysql://localhost:3306/db_1";
	static String userPass="root";
	static String userId="root";
	
	private static Connection_Factory FactoryConnection=null;
	
	private Connection_Factory() {
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
	
	public static Connection_Factory getInstance() {
		if (FactoryConnection==null) {
			FactoryConnection=new Connection_Factory();
		}
		return FactoryConnection;
	}
	
	
}
