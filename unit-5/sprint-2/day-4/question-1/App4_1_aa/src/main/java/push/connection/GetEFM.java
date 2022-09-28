package push.connection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GetEFM {


	private static EntityManagerFactory emf;
	
	static{
		emf=Persistence.createEntityManagerFactory("Sp2D4");
	}
	
	public static EntityManager provideEntityManager(){
		
		EntityManager em= emf.createEntityManager();
		return em;
	
	}
}
