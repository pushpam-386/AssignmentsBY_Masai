package Connection.classs;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EMFConnection {
	
	private static EntityManagerFactory eMF; 
	
	static {
		eMF=Persistence.createEntityManagerFactory("Unit");
	}

	
	public static EntityManager getConn() {
		EntityManager em=eMF.createEntityManager();
		return em;
	}
}
