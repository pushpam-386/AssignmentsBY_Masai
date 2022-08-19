import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter a number between 1 and 10");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if(number>0 && number<11){
            Child child = new Child(number);
            child.method1();
        }
        else{
            System.out.println("Invalid number");
        }
        Parent parent = new Parent(7);
        parent.method1();
        parent.method2();
        parent.method3();
    }
}