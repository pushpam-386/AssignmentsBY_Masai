import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Prime till what integer:");
        int p=sc.nextInt();
        Test t=new Test();
        int[] arr= t.display(p);

        String bag="";
        for(int i=0;i<arr.length;i++){
            bag+=arr[i]+" ";
        }
        System.out.println(bag);
    }
}