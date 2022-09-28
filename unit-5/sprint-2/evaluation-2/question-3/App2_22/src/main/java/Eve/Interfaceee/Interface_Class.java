package Eve.Interfaceee;

import java.util.List;

import Eve.Classeses.Course;
import Eve.Classeses.Student;
import Eve.Classeses.Teacher;
import Eve.ExceptionP.CourseException;
import Eve.ExceptionP.TeacherException;

public interface Interface_Class {
	
	public void addCourse(Course course);
	
	public void registerStudent(Student student,int courseId)throws CourseException;
	
     public void registerTeacher(Teacher teacher);
	
	public void assignTeacherWithCourse(int teacherId, int courseId) throws TeacherException, CourseException;
	
	public List<Student> getAlltheStudentsByCourseName(String courseName)throws CourseException;
	

}
