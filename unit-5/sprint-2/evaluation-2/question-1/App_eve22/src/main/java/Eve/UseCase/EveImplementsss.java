package Eve.UseCase;

import java.util.List;

import javax.persistence.EntityManager;

import com.mysql.cj.Query;

import Eve.Classess.Department;
import Eve.Classess.Employee;
import Eve.Conection.GetEMFClass;
import Eve.Exception.DepartmentException;
import Eve.Exception.EmployeeException;

public class EveImplementsss implements InterfacEDao {

	public void addDepartment(Department dept) {
		EntityManager em =GetEMFClass.provideEntityManager();
		
		em.getTransaction().begin();
		em.persist(dept);
		em.getTransaction().commit();
		
		em.close();
		
	}

	public void addEmployee(Employee emp) {
		EntityManager em =GetEMFClass.provideEntityManager();
		
		em.getTransaction().begin();
		em.persist(emp);
		em.getTransaction().commit();
		
		em.close();
		
		
	}

	public void registerEmployeeTODepartment(int empId, int deptId) throws EmployeeException, DepartmentException {
		EntityManager em =GetEMFClass.provideEntityManager();
		
		Employee emp=em.find(Employee.class, empId);
		Department dep=em.find(Department.class, empId);
		
		
		em.getTransaction().begin();
		dep.getEmployees().add(emp);
		em.getTransaction().commit();
		
		em.close();
		
	}

	public List<Employee> getAllEmployeeWithDeptName(String deptName) throws EmployeeException {
		EntityManager em =GetEMFClass.provideEntityManager();
		
		String qString="select e from employee e where deptName = :1";
		
		javax.persistence.Query query=em.createQuery(qString);
		
		query.setParameter(1, deptName);
		
		List<Employee> emp =query.getResultList();
		
		em.close();
		return emp;
	}

	public Department getDepartmentDetailsByEmployeeId(int empId) throws DepartmentException {
		EntityManager em =GetEMFClass.provideEntityManager();
		
String qString="select d from department d where empId = :1";
		
		javax.persistence.Query query=em.createQuery(qString);
		
		query.setParameter(1, empId);
		
		Department dep =(Department) query.getSingleResult();
		
		em.close();
		return dep;
	}

}
