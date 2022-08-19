import java.util.Scanner;
public class Main {
    public static Employee getEmployeeDetails(){
        Employee emp=new Employee();
        return emp;
    }

    public static int getPFPercentage(){
        System.out.println("Enter Employee PF percentage:");
        Scanner sca=new Scanner(System.in);
        int pfPercentage=sca.nextInt();
        return pfPercentage;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Employee Id:");
        int id=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Employee Name:");
        String name=sc.nextLine();
        System.out.println("Enter Employee Salary:");
        double salary=sc.nextDouble();
        sc.nextLine();


        Employee employee=getEmployeeDetails();
        employee.setEmployeeId(id);
        employee.setEmployeeName(name);
        employee.setSalary(salary);


        int ID=employee.getEmployeeId();
        System.out.println("Employee Id:"+ID);
        String Name=employee.getEmployeeName();
        System.out.println("Employee Name:"+Name);
        double Salary=employee.getSalary();
        System.out.println("Employee Salary:"+Salary);
        employee.calculateNetSalary(getPFPercentage());
        System.out.println("Pf Percentage:"+employee.getNetSalary());

    }
}