package Eve.UseCase;

import javax.persistence.EntityManager;

import Eve.Classess.Department;
import Eve.Classess.Employee;
import Eve.Conection.GetEMFClass;

public class AddEmployee {

	public static void main(String[] args) {

		Employee employee=new Employee();
		employee.setEmpName("Pushpam");
		employee.setEmpId(1);
		employee.setSalary(20000);
		
		InterfacEDao interfacEDao=new EveImplementsss();
		
		interfacEDao.addEmployee(employee);

	}

}
