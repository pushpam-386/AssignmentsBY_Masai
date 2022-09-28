package Usecase.jpa;

import Daoimplementation.jpa.DaoImplementation;
import Daointerface.jpa.DaoInterface;
import Daointerface.jpa.EmployeeException;
import employee.jpa.Employee;

public class RegisterEmployee {

	public static void main(String[] args) {
		Employee employee1=new Employee("Pushpam","Ramnagri",5000);
		Employee employee2=new Employee("Aakash","Moob",8000);
		
		DaoInterface run1=new DaoImplementation();
		try {
			Employee employeeReturned1=run1.registerEmployee(employee1);
			Employee employeeReturned2=run1.registerEmployee(employee2);
			System.out.println("Employee Registered:- ");
			System.out.println(employeeReturned1.toString());
			System.out.println(employeeReturned2.toString());
			
		} catch (EmployeeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
