import java.util.Scanner;
public class AllStudents {

    public static void main(String[] args) {
        Student obj=new ScienceStudent(90,80,70);
        Scanner sc=new Scanner(System.in);
        System.out.println("Name of 1st Student:");
        obj.name=sc.nextLine();
        System.out.println("Name of 1st address:");
        obj.address=sc.nextLine();
        System.out.println("Science Student percentage:"+obj.getPercentage());

        Student obj2=new HistoryStudent(60,80);
        System.out.println("Name of 2st Student:");
        obj2.name=sc.nextLine();
        System.out.println("Name of 2st address:");
        obj2.address=sc.nextLine();
        System.out.println("History Student percentage:"+obj2.getPercentage());
        sc.close();

    }
}