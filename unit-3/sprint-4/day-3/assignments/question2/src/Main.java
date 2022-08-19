import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        IPL ipl=new IPL();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Match venue:");
        String str=sc.nextLine();
        ipl.homeTeamStadium(Stadium.valueOf(str));

    }
}