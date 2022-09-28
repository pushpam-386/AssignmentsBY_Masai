package ass.useCase;

import javax.persistence.EntityManager;

import ass.Connect.EFMConnnect;
import ass.classs.College;
import ass.classs.Student;

public class AddStudent {

	public static void main(String[] args) {
		EntityManager em =EFMConnnect.provideEntityManager();
		
		College college1=new College();
		college1.setCollageName("Kiit");
		college1.setCollageAddress("bbs");
		
		Student student1=new Student();
		student1.setStudentName("Pushpam");
		student1.setMobileNumber("7488800002");
		student1.setEmail("Pushpam@gmail.com");
		
		college1.getStudent().add(student1);
		student1.setCollege(college1);
		
        em.getTransaction().begin();
		
		em.persist(college1);
		
		em.getTransaction().commit();

		System.out.println("done");

	}

}
