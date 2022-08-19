
import java.util.InputMismatchException;
import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        System.out.println("start of main..");
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter num1");
            int num1 = sc.nextInt();
            System.out.println("Enter num2");
            int num2 = sc.nextInt();
            String message = null;
            int num3 = num1 / num2;
            if (!(num3 > 10)){
                throw new CustomException("String Exc");
            }
            System.out.println("We");
        } catch (ArithmeticException ae) {
            System.out.println("inside catch..");
            System.out.println(ae.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Please enter valid number");
        }
        catch (CustomException e){
            System.out.println(e);
        }

        System.out.println("end of main");
    }
}
