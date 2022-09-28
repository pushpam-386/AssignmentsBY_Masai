package push.running;

import java.util.List;

import javax.persistence.EntityManager;

import push.GetEFM.GetConnection;
import push.classes.Course;
import push.classes.Student;

public class Demo2 {

	public static void main(String[] args) {
		EntityManager em =GetConnection.provideEntityManager();
		
		List<Student> sList=em.find(Course.class, 1).getStudents();
		
		sList.forEach(s->{
			System.out.println(s.getRoll());
			System.out.println(s.getName());
			System.out.println(s.getMobile());
			System.out.println(s.getEmail());
		});
		em.close();
	}

}
