package Usecase.jpa;

import java.util.Scanner;

import Daoimplementation.jpa.DaoImplementation;
import Daointerface.jpa.DaoInterface;
import Daointerface.jpa.EmployeeException;
import employee.jpa.Employee;

public class GetEmployeeById {

	public static void main(String[] args) {
		DaoInterface daoInterface=new DaoImplementation();
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter e_id to show:  ");
			int i=scanner.nextInt();
			try {
				Employee emp=daoInterface.getEmployeeById(i);
				System.out.println(emp.toString());
				
			} catch (EmployeeException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
