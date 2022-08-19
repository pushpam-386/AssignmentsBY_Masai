import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static <i1> void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List <String> city=new ArrayList<>();
        System.out.println("Enter no. of City to be entered: ");
        int input=sc.nextInt();
        for (int i=0;i<input;i++){
            System.out.println("Enter city Name: ");
            String city_entry=sc.next();
            city.add(city_entry);
        }
        PrintList i1 = (List lo) -> {
            for (int i=0;i<input;i++) {
                System.out.println("City Name:-  " + lo.get(i));
            }
        };
        i1.display(city);
    }

}