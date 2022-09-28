package ass.classs;

import java.util.ArrayList;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import java.util.List;

@Entity
public class College {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int collageId;
	private String collageName;
	private String collageAddress;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "college")
	private List<Student> student=new ArrayList<Student>();
	
	public College() {
		
	}
	
	
	public College(String collageName, String collageAddress, List<Student> student) {
		
		this.collageName = collageName;
		this.collageAddress = collageAddress;
		this.student = student;
	}


	public List<Student> getStudent() {
		return student;
	}


	public void setStudent(List<Student> student) {
		this.student = student;
	}


	public College(int collageId, String collageName, String collageAddress) {
		
		this.collageId = collageId;
		this.collageName = collageName;
		this.collageAddress = collageAddress;
	}
	
	public int getCollageId() {
		return collageId;
	}
	public void setCollageId(int collageId) {
		this.collageId = collageId;
	}
	public String getCollageName() {
		return collageName;
	}
	public void setCollageName(String collageName) {
		this.collageName = collageName;
	}
	public String getCollageAddress() {
		return collageAddress;
	}
	public void setCollageAddress(String collageAddress) {
		this.collageAddress = collageAddress;
	}
	
	
}
