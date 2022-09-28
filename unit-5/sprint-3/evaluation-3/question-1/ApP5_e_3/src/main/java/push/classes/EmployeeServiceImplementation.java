package push.classes;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImplementation implements EmployeeService {

	@Override
	public boolean saveEmployee(Employee emp) {
EntityManager em=GetConnection.provideEntityManager();
		
		em.getTransaction().begin();
		em.persist(em);
		em.getTransaction().commit();
		em.close();
		
		if(em!=null) {
		return true;
		}
		else {
			return false;}
	}

	@Override
	public List getAllEmployee() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee getEmployeeById(int empId) throws EmployeeException {
		EntityManager em=GetConnection.provideEntityManager();
		
		Employee e =em.find(Employee.class, empId);
		return e;
	}

	@Override
	public String deleteEmployeeById(int empId) throws EmployeeException {
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
