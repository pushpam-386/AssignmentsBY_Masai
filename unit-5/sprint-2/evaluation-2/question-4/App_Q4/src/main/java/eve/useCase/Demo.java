package eve.useCase;

import javax.persistence.EntityManager;

import EFM.connect.GetEFMConn;
import eve.classes.ContractualEmployee;
import eve.classes.SalariedEmployee;

public class Demo {

	public static void main(String[] args) {
		EntityManager em =GetEFMConn.provideEntityManager();
		
		SalariedEmployee salariedEmployee1=new SalariedEmployee();
		salariedEmployee1.setEmpName("Pushpam");
		salariedEmployee1.setEmail("Pushp@g.com");
		salariedEmployee1.setSalary(4000);
		
		SalariedEmployee salariedEmployee2=new SalariedEmployee();
		salariedEmployee2.setEmpName("Topam");
		salariedEmployee2.setEmail("Pushp@g.csdvsdom");
		salariedEmployee2.setSalary(4000);
		
		SalariedEmployee salariedEmployee3=new SalariedEmployee();
		salariedEmployee1.setEmpName("Pefefrsdfhpam");
		salariedEmployee1.setEmail("Pushp@g.coedsvm");
		salariedEmployee1.setSalary(400660);
		
		SalariedEmployee salariedEmployee4=new SalariedEmployee();
		salariedEmployee1.setEmpName("ghyushpam");
		salariedEmployee1.setEmail("Pushdfascddscp@g.com");
		salariedEmployee1.setSalary(400);
		
		
		ContractualEmployee contractualEmployee1=new ContractualEmployee();
		contractualEmployee1.setEmpName("ddehpam");
		contractualEmployee1.setMobileNumber("345676543");
		contractualEmployee1.setCostofperday(889);
		contractualEmployee1.setNoOfWorkingDays(876);
		
		ContractualEmployee contractualEmployee2=new ContractualEmployee();
		contractualEmployee2.setEmpName("ddehpam");
		contractualEmployee2.setMobileNumber("345676543");
		contractualEmployee2.setCostofperday(889);
		contractualEmployee2.setNoOfWorkingDays(876);
		
		ContractualEmployee contractualEmployee3=new ContractualEmployee();
		contractualEmployee3.setEmpName("ddehpam");
		contractualEmployee3.setMobileNumber("345676543");
		contractualEmployee3.setCostofperday(889);
		contractualEmployee3.setNoOfWorkingDays(876);
		
		ContractualEmployee contractualEmployee4=new ContractualEmployee();
		contractualEmployee4.setEmpName("ddehpam");
		contractualEmployee4.setMobileNumber("345676543");
		contractualEmployee4.setCostofperday(889);
		contractualEmployee4.setNoOfWorkingDays(876);
		
		
		em.getTransaction().begin();
		
		em.persist(salariedEmployee1);
		em.persist(salariedEmployee2);
		em.persist(salariedEmployee3);
		em.persist(salariedEmployee4);
		
		em.persist(contractualEmployee4);
		em.persist(contractualEmployee3);
		em.persist(contractualEmployee2);
		em.persist(contractualEmployee1);
		
		em.getTransaction().commit();
		
		System.out.println("Done");
		
		em.close();
		
		
		

	}

}
