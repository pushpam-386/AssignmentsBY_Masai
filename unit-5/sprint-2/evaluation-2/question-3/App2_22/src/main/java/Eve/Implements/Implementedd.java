package Eve.Implements;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EntityManager;

import Eve.Classeses.Course;
import Eve.Classeses.Student;
import Eve.Classeses.Teacher;
import Eve.ExceptionP.CourseException;
import Eve.Interfaceee.Interface_Class;
import Get.Connection.EFM_Connnnectionn;

public class Implementedd implements Interface_Class {

	@Override
	public void addCourse(Course course) {
	 EntityManager em =EFM_Connnnectionn.provideEntityManager();
		
	}

	@Override
	public void registerStudent(Student student, int courseId) throws CourseException {
		// TODO Auto-generated method stub
		EntityManager em =EFM_Connnnectionn.provideEntityManager();
		
	}

	@Override
	public void registerTeacher(Teacher teacher) {
		// TODO Auto-generated method stub
		EntityManager em =EFM_Connnnectionn.provideEntityManager();
	}

	@Override
	public void assignTeacherWithCourse(int teacherId, int courseId) throws CourseException {
		// TODO Auto-generated method stub
		EntityManager em =EFM_Connnnectionn.provideEntityManager();
		
	}

	@Override
	public List<Student> getAlltheStudentsByCourseName(String courseName) throws CourseException {
		// TODO Auto-generated method stub
		EntityManager em =EFM_Connnnectionn.provideEntityManager();
		return null;
	}

}
