package day_2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.cj.protocol.Resultset;
import com.mysql.cj.protocol.a.result.ResultsetRowsStatic;

public class Employee {
	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter roll");
		int e_id= sc.nextInt();
		
		System.out.println("Enter Name");
		String name= sc.next();
		
		System.out.println("Enter Address");
		String address= sc.next();
		
		System.out.println("Enter Salary");
		float salary= sc.nextFloat();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String url="jdbc:mysql://localhost:3306/db1";
		
		try (Connection connection=DriverManager.getConnection(url,"root","root")){
			
			PreparedStatement ps=connection.prepareStatement("insert into Employee values(?,?,?,?)");
			
			ps.setInt(1,e_id);
			ps.setString(2,name);
			ps.setString(3,address);
			ps.setFloat(4,salary);
			
            int x= ps.executeUpdate();
            
            
			
			
			if(x >0) {
				System.out.println("record inserted sucessfully");
			}
			else
				System.out.println("not inserted...");
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		   
		
		
		
		
            System.out.println("Enter id for salary");
		    int id=sc.nextInt();
		
		    try(Connection connection=DriverManager.getConnection(url,"root","root")){
			
			PreparedStatement ps=connection.prepareStatement("select salary from employee where e_id= ?");
			
			ps.setInt(1,id);
			
			ResultSet rs=ps.executeQuery();
			
			if (rs.next()) {
				float sal=rs.getFloat("salary");
				
				System.out.print("salary:  for"+ id+"   " +sal);
			}
			
		    }
		    catch (Exception e) {
				// TODO: handle exception
		    	e.printStackTrace();
			}
		    
		    
		    
		    
		    System.out.println("Enter bonus given to employees");
		    int bonus=sc.nextInt();
		
		    try(Connection connection=DriverManager.getConnection(url,"root","root")){
			
			PreparedStatement ps=connection.prepareStatement("update employee set salary=salary+?");
			
			ps.setInt(1,bonus);
			
			int x=ps.executeUpdate();
			
			if (x>0) {
				
				System.out.print("update applied");
			}
			
		    }
		    catch (Exception e) {
				// TODO: handle exception
		    	e.printStackTrace();
			}
		
	}
}








