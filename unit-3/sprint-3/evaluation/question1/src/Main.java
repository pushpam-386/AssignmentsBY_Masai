import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of passenger:");
        int numberOfPassenger=sc.nextInt();
        System.out.println("Enter no. of kms:");
        int numberOfKms=sc.nextInt();
        Ola ola=new Ola();
        Car car=ola.bookCar(numberOfPassenger,numberOfKms);
        int res=ola.calculateBill(car);
        System.out.println("The total fare amount is:"+res);
    }
}