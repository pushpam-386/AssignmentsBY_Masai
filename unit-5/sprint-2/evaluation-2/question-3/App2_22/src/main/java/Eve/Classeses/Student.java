package Eve.Classeses;

import java.util.ArrayList;

import javax.annotation.processing.Generated;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import antlr.collections.List;

@Entity
public class Student {
	
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private int roll;
	private String name;
	private String email;
	private String mobile;
	
	@ManyToMany(cascade = CascadeType.ALL)
	private java.util.List<Course> courses=new ArrayList<>();

	public Student(int roll, String name, String email, String mobile, java.util.List<Course> courses) {
		super();
		this.roll = roll;
		this.name = name;
		this.email = email;
		this.mobile = mobile;
		this.courses = courses;
	}

	public Student() {
		super();
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

	public java.util.List<Course> getCourses() {
		return courses;
	}

	public void setCourses(java.util.List<Course> courses) {
		this.courses = courses;
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", email=" + email + ", mobile=" + mobile + "]";
	}
	
	
}
