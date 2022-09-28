package push.classes;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.stereotype.Repository;

@Repository
public class EmployeeRepoImplementation implements EmployeeRepo {

	@Override
	public boolean insertEmployeeDetails(Employee emp) {
		EntityManager em=GetConnection.provideEntityManager();
		
		em.getTransaction().begin();
		em.persist(em);
		em.getTransaction().commit();
		em.close();
		
		if(em!=null) {
		return true;
		}
		else {
			return false;
			}
	}

	@Override
	public List getAllEmployeeDetails() {
		EntityManager em=GetConnection.provideEntityManager();

	
		return null;
	}

	@Override
	public Employee findEmployee(int empId) {
		EntityManager em=GetConnection.provideEntityManager();
		
		Employee e =em.find(Employee.class, empId);
		return e;
	}

	@Override
	public String deleteEmployeeDetailsById(int empId) {
		EntityManager em=GetConnection.provideEntityManager();
		String flag= null;
		Employee employee =em.find(Employee.class,empId);
		if(employee!=null) {
			em.getTransaction().begin();
			em.remove(employee);
			em.getTransaction().commit();
			flag= "Deleted";
		}
		em.close();
		return flag ;
	}

}
