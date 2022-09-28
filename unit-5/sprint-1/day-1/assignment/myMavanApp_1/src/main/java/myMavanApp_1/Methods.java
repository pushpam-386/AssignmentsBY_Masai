package myMavanApp_1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



public class Methods {
	
	PreparedStatement pdStatement;
	Connection connection;
	ResultSet resultSet;
	
	public Connection takeConnection() throws SQLException {
		Connection conn=Connection_Factory.getInstance().connn();
		return conn;
	}
	
	public List<Emp> getAllEmployee() throws Exception{
		connection=takeConnection();
		
		String queryString="Select * from Emp";
		PreparedStatement ps=connection.prepareStatement(queryString);
		
		ResultSet rSet=ps.executeQuery();
		
		List<Emp> list=new ArrayList<>();
		while(rSet.next()) {
			list.add(new Emp(rSet.getInt("e_id"),rSet.getString("name"),rSet.getString(3),rSet.getInt(4)));
		}
		return list;
	}
	
	public String[] getNameAndAddress(int empId) throws Exception{
		connection=takeConnection();
		
		String queryString="";
		PreparedStatement ps=connection.prepareStatement(queryString);
		
		ResultSet rSet=ps.executeQuery();
		
		String[] str=new String[rSet.getFetchSize()];
		for(int i=0;i<rSet.getFetchSize();i++) {
			String nameString=rSet.getString("name");
			String addressString=rSet.getString("address");
			
			str[i]=nameString+"   "+addressString;
		}
		return str;
	}
	
	public void insertDetails(Emp emp) {
		try {
		String queryString="insert into emp values(?, ?, ?, ?)";
		
		connection=takeConnection();
		pdStatement=connection.prepareStatement(queryString);
		
		pdStatement.setInt(1, emp.getE_id());
		pdStatement.setString(2, emp.getName());
		pdStatement.setString(3, emp.getAddress());
		pdStatement.setFloat(4, emp.getSalary());
		
		pdStatement.executeUpdate();
		
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
			if (pdStatement != null)
			pdStatement.close();
			if (connection != null)
			connection.close();
			} catch (SQLException e) {
			e.printStackTrace();
			} catch (Exception e) {
			e.printStackTrace();
			}
	     }
	}

}
