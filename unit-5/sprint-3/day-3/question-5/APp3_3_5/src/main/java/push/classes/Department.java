package push.classes;

import java.util.Objects;

public class Department {
	
	private int deptId;
	private String deptName;
	private String location;
	
	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(deptId, deptName, location);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Department other = (Department) obj;
		return deptId == other.deptId && Objects.equals(deptName, other.deptName)
				&& Objects.equals(location, other.location);
	}



	public Department() {
		super();
	}



	public Department(int deptId, String deptName, String location) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
		this.location = location;
	}



	public int getDeptId() {
		return deptId;
	}



	public String getDeptName() {
		return deptName;
	}



	public String getLocation() {
		return location;
	}



	@Override
	public String toString() {
		return "Department [deptId=" + deptId + ", deptName=" + deptName + ", location=" + location + "]";
	}
	
	
	
	
	
}
