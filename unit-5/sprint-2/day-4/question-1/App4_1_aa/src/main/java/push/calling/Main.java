package push.calling;

import javax.persistence.EntityManager;

import push.classess.Address;
import push.classess.Employee;
import push.connection.GetEFM;

public class Main {

	public static void main(String[] args) {
		EntityManager em =GetEFM.provideEntityManager();
		
		Employee employee1=new Employee();
		Employee employee2=new Employee();
		
		employee1.setName("Pushpam");
		employee1.setHomeAddress(new Address("Bihar","Patna","800025"));
		employee1.setOfficeAddress(new Address("Bihar","Vaishali","700025"));
		employee1.setSalary(20000);
		
		employee2.setName("Pushpam_Kumar");
		employee2.setHomeAddress(new Address("Mumbai","Dobi","500025"));
		employee2.setOfficeAddress(new Address("Delhi","Vaishali","300025"));
		employee2.setSalary(90000);
		
		em.getTransaction().begin();
		em.persist(employee2);
		em.persist(employee1);
		em.getTransaction().commit();
		
		System.out.println("Done");
		em.close();
		
		
		

	}

}
