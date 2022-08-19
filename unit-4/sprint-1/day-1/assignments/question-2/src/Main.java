import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Map<Student,String> mapped=new TreeMap<>(new StudentClassComparator());
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter no. of input: ");
        int input=scanner.nextInt();
        for(int i=0;i<input;i++){
            System.out.println("Enter roll,Name,Marks: ");
            int roll=scanner.nextInt();
            String name=scanner.next();
            double marks=scanner.nextDouble();
            Student student=new Student(roll,name,marks);
            System.out.println("Enter Student State: ");
            String state=scanner.next();
            mapped.put(student,state);
        }
        Set<Map.Entry<Student,String>> keys=mapped.entrySet();
        for (Map.Entry<Student,String> student:keys) {
            Student student1=student.getKey();
            System.out.println("Name of Student"+student1.getName()+" --> "+"Student from Particular State"+student.getValue());
        }
    }
}
