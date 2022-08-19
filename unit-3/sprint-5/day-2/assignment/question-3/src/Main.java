import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Start Date:");
        String join=sc.next();
        System.out.println("Enter end Date:");
        String end=sc.next();

        Wage obj=new Wage();
        try {
            obj.calWage(join,end);
        }
        catch (InvalidFormatException invalidFormatException1){
            invalidFormatException1.printStackTrace();
        }

    }
}