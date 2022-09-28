package question_1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Methods {
	
	PreparedStatement pdStatement;
	Connection connection;
	ResultSet resultSet;
	
	public Connection takeConnection() throws SQLException {
		Connection conn=Jdbc_connection.getInstance().connn();
		return conn;
	}
	

	public void getSalary(int e_id) {
		try {
		String queryString="Select salary from employee3 where e_id= ?";
		
		connection=takeConnection();
		pdStatement=connection.prepareStatement(queryString);
		
		pdStatement.setInt(1, e_id);
		ResultSet rs=pdStatement.executeQuery();
		
		while (rs.next()) {
			System.out.println(rs.getFloat("salary"));
		}
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
	
	public void getAllDetails(String table) {
		try {
		String queryString="Select * from ";
		queryString+=table;
		
		connection=takeConnection();
		pdStatement=connection.prepareStatement(queryString);
		
		ResultSet rs=pdStatement.executeQuery();
		
		while (rs.next()) {
			System.out.println("Employee :"+rs.getInt("e_id")+"  "
			+"Name :"+rs.getString("name")+"  "
			+"Address :"+rs.getString("address")+"  "
			+"Salary :"+rs.getFloat("salary"));
		}
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
	
	public void updateSalary(float bonus) {
		try {
		String queryString="update Employee3 Set salary = salary + ?";
		
		connection=takeConnection();
		pdStatement=connection.prepareStatement(queryString);
		
		pdStatement.setFloat(1, bonus);
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
	
	public void insertDetails(Employee3 emp) {
		try {
		String queryString="insert into employee3(e_id, name, salary) values(?, ?, ?)";
		
		connection=takeConnection();
		pdStatement=connection.prepareStatement(queryString);
		
		pdStatement.setInt(1, emp.getE_id());
		pdStatement.setString(2, emp.getName());
		pdStatement.setFloat(3, emp.getSalary());
		
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
	
	public void getNameOfId(int empId) {
		try {
		String queryString="select * from employee3 where e_id = ?";
		
		connection=takeConnection();
		pdStatement=connection.prepareStatement(queryString);
		
		pdStatement.setInt(1, empId);
		
		ResultSet rs=pdStatement.executeQuery();
		
		if (rs!=null) {
			rs.next();
			System.out.println("Name of Employee :"+ rs.getInt("e_id"));
		}
		else {
			System.out.println("No Employee of this id is there ");
		}
		
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
	
	
	public void getDeatailsBySalary(float sal) {
		try {
		String queryString="select * from employee3 where salary < ?";
		
		connection=takeConnection();
		pdStatement=connection.prepareStatement(queryString);
		
		pdStatement.setFloat(1, sal);
		
		ResultSet rs=pdStatement.executeQuery();
		
		while (rs.next()) {
			System.out.println("Employee :"+rs.getInt("e_id")+"  "
			+"Name :"+rs.getString("name")+"  "
			+"Address :"+rs.getString("address")+"  "
			+"Salary :"+rs.getFloat("salary"));
		}
		
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

