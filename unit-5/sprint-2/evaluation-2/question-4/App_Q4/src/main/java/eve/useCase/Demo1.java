package eve.useCase;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import EFM.connect.GetEFMConn;
import eve.classes.SalariedEmployee;

public class Demo1 {

	public static void main(String[] args) {
EntityManager em =GetEFMConn.provideEntityManager();
		
		String querString="Select s from SalariedEmployee s";
		
		Query q=em.createQuery(querString);
		
		List<SalariedEmployee> salariedEmployees=q.getResultList();
		
		System.out.println(salariedEmployees);
		
		em.close();

	}

}
