package Eve.UseCase;

import javax.persistence.EntityManager;

import Eve.Classess.Department;
import Eve.Conection.GetEMFClass;

public class AddDepartment {

	public static void main(String[] args) {
		
		Department department=new Department();
		department.setDeptNam("Bio");
		department.setLocation("bbs");
		
		InterfacEDao interfacEDao=new EveImplementsss();
		
		interfacEDao.addDepartment(department);

	}

}
