import java.security.Key;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Map<Employee,Integer> map=new TreeMap<>();
        Employee e1=new Employee(1,"pushpam","Patna");
        Employee e2=new Employee(3,"Deepak","Patna");

        map.put(e1,7000);
        map.put(e2,6000);
        Set<Employee> tp= map.keySet();
        for (Employee employee:tp) {
            System.out.println("Employee: "+employee.getEmpId()+" "+employee.getName()+" "+employee.getAddress()+"Salary: "+map.get(employee));
        }
    }
}