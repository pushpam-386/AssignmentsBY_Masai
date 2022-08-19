import java.util.Scanner;
public class IndexString {
    public static void index(String str){
        char ind=str.charAt(2);
        System.out.println(ind);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String st=sc.nextLine();
        index(st);
    }
}
