import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Student> l1=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no. of student details to be entered: ");
        int input=sc.nextInt();
        for (int i=0;i<input;i++){

            System.out.println("Enter roll no. : ");
            int roll=sc.nextInt();
            System.out.println("Enter Name of Students");
            String name=sc.next();
            System.out.println("Enter students Marks: ");
            double mark=sc.nextDouble();

            Student obj=new Student(roll,name,mark);
            l1.add(obj);
        }
        List<Employee> l2= new ArrayList<>();

        l1.stream()
                .map(student -> {
            Employee employee = new Employee(student.getRoll(), student.getName(), student.getMarks()*1000);
            return l2.add(employee);
        })
                .collect(Collectors.toList());
        l2.stream()
                .forEach(p-> System.out.println("EmpId:"+p.getEmpId()+"EmpName:"+p.getEmpName()+"EmpSalary:"+p.getSalary()));


    }
}