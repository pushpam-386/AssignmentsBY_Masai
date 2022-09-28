package ass.useCase;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import ass.Connect.EFMConnnect;
import ass.classs.College;
import ass.classs.Student;

public class StudentDetailsOnCol_Id {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter College id to get Student Details:   ");
		int cid=scanner.nextInt();
		
		EntityManager em=EFMConnnect.provideEntityManager();
		
		List<Student> stu=em.find(College.class, cid).getStudent();
		
		System.out.println(stu);
		
		em.close();

	}

}
