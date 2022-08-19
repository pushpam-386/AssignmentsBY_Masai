import java.util.Scanner;
public class Factorial {
    public static int Main(String input){
        int res=0;
        if(input.length()==1){
            int num=Integer.parseInt("input[0]");
            for(int i=0;i<num;i++){
               res*=num-i;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a No.");
        String input = sc.nextLine();
        int result=Main(input);
        System.out.println(result);
    }
}
