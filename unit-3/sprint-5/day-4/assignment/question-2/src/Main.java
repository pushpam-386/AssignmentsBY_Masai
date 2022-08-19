import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            Set<Employee> listed=new TreeSet<>(new EmployeeIdComp());
            System.out.println("No. of Student Details to be Entered: ");
            int count=sc.nextInt();
            for(int i=0;i<count;i++){
                System.out.println("Enter ProductId:");
                int id=sc.nextInt();
                System.out.println("Enter Product name: ");
                String name=sc.next();
                System.out.println("Enter Product Price: ");
                double salary=sc.nextDouble();
                Employee product=new Employee(id,name,salary);
                listed.add(product);
            }
        for(Employee p:listed){
            System.out.println(p.getEmpId()+" "+p.getEmpName()+" "+p.getSalary());
        }
    }
}