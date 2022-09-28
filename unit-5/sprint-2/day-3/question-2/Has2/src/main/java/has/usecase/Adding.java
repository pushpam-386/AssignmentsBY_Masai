package has.usecase;

import javax.persistence.EntityManager;

import has.Connec.Get_Connection;
import has.branch.Address;
import has.branch.Customer;

public class Adding {

	public static void main(String[] args) {
		EntityManager eM =Get_Connection.provideEntityManager();
		
		Customer cus=new Customer();
		Customer cus2=new Customer();
		cus.setName("Ram");
		cus.setEmail("push@");
		cus.setMobileNumber(34445654);
		
		cus2.setEmail("frsdsa@");
		cus2.setMobileNumber(44567);
		cus2.setName("dsfdgfy");
		
		
		Address address1=new Address("VVVV","frwe",565433);
		Address address=new Address("Bihar","patna",55555);
		cus.getAddresses().add(address);
		cus.getAddresses().add(address1);
		
		cus2.getAddresses().add(address);
		cus2.getAddresses().add(address1);
		
		eM.getTransaction().begin();
		
		eM.persist(cus);
		eM.persist(cus2);
		
		
		eM.getTransaction().commit();
		
		System.out.println("done...");
		
		
		eM.close();
		
		
	}

}
