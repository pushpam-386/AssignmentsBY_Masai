package Eve.Classeses;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.ManyToOne;

public class Course {
	
	private int courseId;
	private String courseName;
	private int duration;
	private int fee;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private List<Student> students=new ArrayList<>();
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Teacher teacher;

	public Course(int courseId, String courseName, int duration, int fee, List<Student> students, Teacher teacher) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.duration = duration;
		this.fee = fee;
		this.students = students;
		this.teacher = teacher;
	}

	public Course() {
		super();
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public int getFee() {
		return fee;
	}

	public void setFee(int fee) {
		this.fee = fee;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseName=" + courseName + ", duration=" + duration + ", fee=" + fee
				+ ", students=" + students + "]";
	}
	
	
	
}
