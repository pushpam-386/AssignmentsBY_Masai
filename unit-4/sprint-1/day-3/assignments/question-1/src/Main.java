import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Students> l1=new ArrayList<>();
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

            Students obj=new Students(roll,name,mark);
            l1.add(obj);
        }

        Collections.sort(l1, new RollComparator());

        for (Students s1:l1) {
            System.out.println(s1.rollNo+" "+s1.marks+" "+s1.Name);
        }
    }
}