package push.running;

import java.util.List;

import javax.persistence.EntityManager;

import push.GetEFM.GetConnection;
import push.classes.Course;
import push.classes.Student;

public class Demo3 {

	public static void main(String[] args) {
EntityManager em =GetConnection.provideEntityManager();
		
		List<Course> cList=em.find(Student.class, 4).getCourses();
		
		cList.forEach(s->{
			System.out.println(s.getCourseId());
			System.out.println(s.getCourseName());
			System.out.println(s.getDuration());
			System.out.println(s.getFee());
		});
		em.close();
	}

}
