package has.Connec;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Get_Connection {
		
		
		private static EntityManagerFactory emf;
		
		static{
			emf=Persistence.createEntityManagerFactory("Customer-Unit");
		}
		
		public static EntityManager provideEntityManager(){
			
			EntityManager em= emf.createEntityManager();
			return em;
		}
}
