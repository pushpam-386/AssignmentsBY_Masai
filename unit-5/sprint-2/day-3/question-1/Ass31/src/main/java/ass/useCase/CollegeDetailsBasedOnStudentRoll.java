package ass.useCase;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;

import ass.Connect.EFMConnnect;
import ass.classs.College;
import ass.classs.Student;

public class CollegeDetailsBasedOnStudentRoll {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Student Roll to get College Details:   ");
		int roll=scanner.nextInt();
		
		EntityManager em=EFMConnnect.provideEntityManager();
		
		College college=em.find(Student.class, roll).getCollege();
		
		System.out.println(college.getCollageName());
		System.out.println(college.getCollageAddress());
		System.out.println(college.getCollageId());
		
		em.close();


	}

}
