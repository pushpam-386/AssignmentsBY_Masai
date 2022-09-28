package eve.useCase;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import EFM.connect.GetEFMConn;
import eve.classes.ContractualEmployee;

public class Demo2 {

	public static void main(String[] args) {
		EntityManager em =GetEFMConn.provideEntityManager();
		
		String querString="Select c from ContractualEmployee c";
		
		Query q=em.createQuery(querString);
		
		List<ContractualEmployee> contractualEmployees=q.getResultList();
		
		System.out.println(contractualEmployees);
		
		em.close();
	}

}
