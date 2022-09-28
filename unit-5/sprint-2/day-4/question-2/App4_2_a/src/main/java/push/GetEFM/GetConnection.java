package push.GetEFM;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GetConnection {
	

	private static EntityManagerFactory emf;
	
	static{
		emf=Persistence.createEntityManagerFactory("Sp2-D4");
	}
	
	public static EntityManager provideEntityManager(){
		
		EntityManager em= emf.createEntityManager();
		return em;
	
	}
	
}
