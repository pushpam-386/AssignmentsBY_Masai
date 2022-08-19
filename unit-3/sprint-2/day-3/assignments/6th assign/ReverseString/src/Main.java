import java.util.Scanner;

public class Main {
    public static String reversString(String input){
        String reverse="";
        for(int i=input.length()-1;i>=0;i--){
            reverse+=input.charAt(i);
        }
        return(reverse);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String to reverse");
        String originalString = sc.next();
        String result = reversString(originalString);
        System.out.println("Original String is :"+ originalString);
        System.out.println("Reversed String is :"+ result);
    }
}
