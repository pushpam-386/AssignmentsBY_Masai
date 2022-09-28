package push.running;

import javax.persistence.EntityManager;

import push.GetEFM.GetConnection;
import push.classes.Course;
import push.classes.Student;

public class Demo1 {

	public static void main(String[] args) {
		EntityManager em =GetConnection.provideEntityManager();
		
		Student s1=new Student();
		Student s2=new Student();
		
		
		s1.setName("Pushpam");
		s1.setMobile("23456789876");
		s1.setEmail("Pushpam@gmail.com");
		
		s2.setName("Dom");
		s2.setMobile("7556789876");
		s2.setEmail("dom@gmail.com");
		
		Course c1=new Course();
		Course c2=new Course();
		
		c1.setCourseName("Civil");
		c1.setDuration(4);
		c1.setFee(12);
		
		c2.setCourseName("Developer");
		c2.setDuration(6);
		c2.setFee(3);
		
		s1.getCourses().add(c1);
		s1.getCourses().add(c2);
		
		s2.getCourses().add(c1);
		s2.getCourses().add(c2);
		
		c1.getStudents().add(s1);
		c1.getStudents().add(s2);
		
		c2.getStudents().add(s1);
		c2.getStudents().add(s2);
		
		em.getTransaction().begin();
		em.persist(c1);
		em.persist(c2);
		em.getTransaction().commit();
		
		System.out.println("Done");
		em.close();
	
	}

}
