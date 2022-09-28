package Usecase.jpa;

import java.util.Scanner;

import Daoimplementation.jpa.DaoImplementation;
import Daointerface.jpa.DaoInterface;
import Daointerface.jpa.EmployeeException;
import employee.jpa.Employee;

public class UpdateEmployee {

	public static void main(String[] args) {
		Employee employee1=new Employee(2,"Pushpam","Ramnagri",5000);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter salary to be incremented: ");
		int salary=sc.nextInt();
		employee1.setSalary(employee1.getSalary()+salary);
		DaoInterface run1=new DaoImplementation();
		try {
			Employee employeeReturned1=run1.updateEmployee(employee1);
			System.out.println("Employee updated:- ");
			System.out.println(employeeReturned1.toString());
			
		} catch (EmployeeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		


	}

}
