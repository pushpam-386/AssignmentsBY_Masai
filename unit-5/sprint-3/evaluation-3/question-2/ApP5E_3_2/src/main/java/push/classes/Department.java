package push.classes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Department {
	
	private int prideptId;
	private String deptName;
	private String location;

	public int getPrideptId() {
		return prideptId;
	}
	
	@Autowired
	public void setPrideptId(int prideptId) {
		this.prideptId = prideptId;
	}

	public String getDeptName() {
		return deptName;
	}
	
	@Autowired
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getLocation() {
		return location;
	}
	
	@Autowired
	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Department [prideptId=" + prideptId + ", deptName=" + deptName + ", location=" + location + "]";
	}

	
	
}
