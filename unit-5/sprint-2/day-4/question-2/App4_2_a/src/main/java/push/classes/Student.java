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
public class Student {
	
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private int roll;
	private String name;
	private String email;
	private String mobile;
	
	@ManyToMany(mappedBy = "students" ,cascade = CascadeType.ALL)
	private List<Course> courses=new ArrayList<>();

	public Student(int roll, String name, String email, String mobile, List<Course> courses) {
		
		this.roll = roll;
		this.name = name;
		this.email = email;
		this.mobile = mobile;
		this.courses = courses;
	}

	public Student() {
		
	}

	public Student(String name, String email, String mobile, List<Course> courses) {
		
		this.name = name;
		this.email = email;
		this.mobile = mobile;
		this.courses = courses;
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", email=" + email + ", mobile=" + mobile + "]";
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}
	
	
	
}
