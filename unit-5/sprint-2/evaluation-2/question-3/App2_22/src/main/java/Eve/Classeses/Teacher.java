package Eve.Classeses;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.OneToMany;

public class Teacher {
	
	private int teacherId;
	private String teacherName;
	private int noYearOfExperince;
	private String email;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Course> courses=new ArrayList<>();

	public Teacher(int teacherId, String teacherName, int noYearOfExperince, String email, List<Course> courses) {
		super();
		this.teacherId = teacherId;
		this.teacherName = teacherName;
		this.noYearOfExperince = noYearOfExperince;
		this.email = email;
		this.courses = courses;
	}

	public Teacher() {
		super();
	}

	public int getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public int getNoYearOfExperince() {
		return noYearOfExperince;
	}

	public void setNoYearOfExperince(int noYearOfExperince) {
		this.noYearOfExperince = noYearOfExperince;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}

	@Override
	public String toString() {
		return "Teacher [teacherId=" + teacherId + ", teacherName=" + teacherName + ", noYearOfExperince="
				+ noYearOfExperince + ", email=" + email + "]";
	}
	
	
	
}
