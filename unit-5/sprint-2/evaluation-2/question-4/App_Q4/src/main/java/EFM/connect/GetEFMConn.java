package EFM.connect;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GetEFMConn {

private static EntityManagerFactory emf;
	
	static{
		emf=Persistence.createEntityManagerFactory("Emp-Unit");
	}
	
	public static EntityManager provideEntityManager(){
		
		EntityManager em= emf.createEntityManager();
		return em;
	
	}
}
