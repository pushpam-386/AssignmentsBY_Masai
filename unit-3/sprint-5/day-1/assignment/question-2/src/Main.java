import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        try {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter two no.:");
            int num1=sc.nextInt();
            int num2=sc.nextInt();
            double quotient=num1/num2;
            System.out.println("The quotient of"+"num1/num2 : - "+quotient);
        }
        catch (ArithmeticException ae){
            System.out.println(ae.getMessage());
//            ae.getStackTrace();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Inside finally Block");
        }

    }
}