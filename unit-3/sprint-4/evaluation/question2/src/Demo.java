import java.util.InputMismatchException;
import  java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of Elements in the array");
        try {
            int n= sc.nextInt();

            System.out.println("Enter the elements in the array:");
            int a[]=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            System.out.println("Enter the index of the array element you want to access:");
            int x=sc.nextInt();

            System.out.println("The array element at index"+x+"="+a[x]);
            System.out.println("The array element successfully accessed");
        }
        catch(InputMismatchException e){
            System.out.println("e");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("e");
        }
    }


}
