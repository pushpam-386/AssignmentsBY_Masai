package jpql.interfac;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import table.classs.Employee;

public class JpqlImplementation implements DaoJpqlInter {

	@Override
	public List<Employee> getAllEmployees() throws EmployeeException {
		EntityManager em =Connection.provideEM();
		String queryString="Select e from Employee e";
        Query q= em.createQuery(queryString);
		
		List<Employee> list= q.getResultList();
		if(list.size()==0) {
			throw new EmployeeException("No Employee Found");
		}
		return list;
	}

	@Override
	public List<Employee> getEmployeesByAddress(String address) throws EmployeeException {
		EntityManager em =Connection.provideEM();
		String queryString="select e from Employee e where e.address = ?1";
        Query q= em.createQuery(queryString);
        q.setParameter(1, address);
		
		List<Employee> list= q.getResultList();
		if(list.size()==0) {
			throw new EmployeeException("No Employee Found by address");
		}
		return list;
	}

	@Override
	public List<Employee> getAllEmployeeWithRangeSalary(int startSalary, int endSalary) throws EmployeeException {
		EntityManager em =Connection.provideEM();
		String queryString="select e from Employee e where e.salary > ?1 and e.salary < ?2";
        Query q= em.createQuery(queryString);
        q.setParameter(1, startSalary);
        q.setParameter(2, endSalary);
		
		List<Employee> list= q.getResultList();
		if(list.size()==0) {
			throw new EmployeeException("No Employee Found by salary range");
		}
		return list;
	}

	@Override
	public Object[] getEmployeeNameAndSalary(int empId) throws EmployeeException {
		EntityManager em =Connection.provideEM();
		String queryString="select e.name, e.salary from Employee e where e.empId = ?1";
        TypedQuery<Object[]> q= em.createQuery(queryString,Object[].class);
        q.setParameter(1, empId);
		
		Object[] or= q.getSingleResult();
		if(or.length==0) {
			throw new EmployeeException("No Employee Found by employeeId to show name and salary");
		}
		return or;
		
	}

	@Override
	public int getEmployeeSalaryById(int empId) throws EmployeeException {
		EntityManager em =Connection.provideEM();
		String queryString="select  e.salary from Employee e where e.empId = ?1";
        TypedQuery q= em.createQuery(queryString,Object.class);
        q.setParameter(1, empId);
		
		Object or= q.getSingleResult();
		if(or==null) {
			throw new EmployeeException("No Employee Found by employeeId to show salary");
		}
		int i=(int) or;
		return i;
	}

}
