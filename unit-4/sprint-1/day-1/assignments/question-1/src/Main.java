import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Map<String,String> mapped=new HashMap<>();
        System.out.println("No. of Input to be taken: ");
        int input=scanner.nextInt();

        for(int i=0;i<input;i++){
            System.out.println("Enter State name: ");
            String state=scanner.next();
            System.out.println("Enter State Capital: ");
            String capital=scanner.next();
            mapped.put(state,capital);
        }
        Set<String> key=mapped.keySet();
        for (String str:key) {
            System.out.println(str+" --> "+mapped.get(str));
        }
    }
}