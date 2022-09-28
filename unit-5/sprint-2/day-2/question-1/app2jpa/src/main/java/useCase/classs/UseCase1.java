package useCase.classs;

import javax.persistence.EntityManager;

import Connection.classs.EMFConnection;
import push.classs.Address;
import push.classs.Employee;

public class UseCase1 {

	public static void main(String[] args) {
		EntityManager eM=EMFConnection.getConn();
		
		Employee emp1=new Employee();
		emp1.setName("Pushpam");
		emp1.setGender("Male");
		emp1.setSalary(4000);
		
		Employee emp2=new Employee();
		emp2.setName("Push");
		emp2.setGender("Male");
		emp2.setSalary(6000);
		
		Employee emp3=new Employee();
		emp3.setName("pavan");
		emp3.setGender("Male");
		emp3.setSalary(7000);
		
		Employee emp4=new Employee();
		emp4.setName("pam");
		emp4.setGender("Female");
		emp4.setSalary(9000);
		
		Address add1=new Address();
		add1.setCity("Patna");
		add1.setState("Bihar");
		add1.setPincode("800001");
		add1.setType("Home");
		
		Address add2=new Address();
		add2.setCity("Banglore");
		add2.setState("Karnataka");
		add2.setPincode("609789");
		add2.setType("office");
		
		emp1.getEmpAddress().add(add1);
		emp1.getEmpAddress().add(add2);
		
		emp2.getEmpAddress().add(add1);
		emp2.getEmpAddress().add(add2);
		
		emp3.getEmpAddress().add(add1);
		emp3.getEmpAddress().add(add2);
		
		emp4.getEmpAddress().add(add1);
		emp4.getEmpAddress().add(add2);
		
        eM.getTransaction().begin();
		
		eM.persist(emp1);
		eM.persist(emp2);
		eM.persist(emp3);
		eM.persist(emp4);
		
		
		eM.getTransaction().commit();
		
		System.out.println("done...");
		eM.close();

	}

}
