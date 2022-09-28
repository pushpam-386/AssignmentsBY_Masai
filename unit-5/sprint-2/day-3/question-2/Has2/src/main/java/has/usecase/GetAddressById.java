package has.usecase;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import has.Connec.Get_Connection;
import has.branch.Address;

public class GetAddressById {

	public static void main(String[] args) {
		EntityManager eM =Get_Connection.provideEntityManager();
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter customerId to display address:  ");
		int cid=scanner.nextInt();
		
		String queryString="select c.addresses from Customer c where cid= ?1";
		
		Query q= eM.createQuery(queryString);
		
		q.setParameter(1,cid);
		
		List<Address> address=q.getResultList();
		
		System.out.println(address);

		eM.close();

	}

}
