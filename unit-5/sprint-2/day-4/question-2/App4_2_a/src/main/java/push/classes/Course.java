package push.classes;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Course {
	
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private int courseId;
	private String courseName;
	private int duration;
	private int fee;
	
	@ManyToMany(cascade = CascadeType.ALL)
	private List<Student> students=new ArrayList<>();

	public Course(int courseId, String courseName, int duration, int fee, List<Student> students) {
		
		this.courseId = courseId;
		this.courseName = courseName;
		this.duration = duration;
		this.fee = fee;
		this.students = students;
	}

	public Course() {
		
	}

	public Course(String courseName, int duration, int fee, List<Student> students) {
		
		this.courseName = courseName;
		this.duration = duration;
		this.fee = fee;
		this.students = students;
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

	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseName=" + courseName + ", duration=" + duration + ", fee=" + fee
				+ "]";
	}
	
	
}
