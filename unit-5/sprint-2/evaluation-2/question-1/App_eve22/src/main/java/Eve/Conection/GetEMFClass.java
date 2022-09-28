package Eve.Conection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GetEMFClass {
	

	private static EntityManagerFactory emf;
	
	static{
		emf=Persistence.createEntityManagerFactory("account-unit");
	}
	
	public static EntityManager provideEntityManager(){
		
		EntityManager em= emf.createEntityManager();
		return em;
	
	}
}
