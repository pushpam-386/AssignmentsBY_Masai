import java.util.Scanner;
public class Demo {

    private static void showDetails(Month m){
        switch (m){
            case JANUARY:
                System.out.println("This is the 1st month of the Year"+m.name());
                break;
            case FEBRUARY:
                System.out.println("This is the 2nd month of the Year"+m.name());
                break;
            case MARCH:
                System.out.println("This is the 3rd month of the Year"+m.name());
                break;
            case APRIL:
                System.out.println("This is the 4th month of the Year"+m.name());
                break;
            case MAY:
                System.out.println("This is the 5th month of the Year"+m.name());
                break;
            case JUNE:
                System.out.println("This is the 6th month of the Year"+m.name());
                break;
            case JULY:
                System.out.println("This is the 7th month of the Year"+m.name());
                break;
            case AUGUST:
                System.out.println("This is the 8th month of the Year"+m.name());
                break;
            case SEPTEMBER:
                System.out.println("This is the 9th month of the Year"+m.name());
                break;
            case OCTOBER:
                System.out.println("This is the 10th month of the Year"+m.name());
                break;
            case NOVEMBER:
                System.out.println("This is the 11th month of the Year"+m.name());
                break;
            case DECEMBER:
                System.out.println("This is the 12th month of the Year"+m.name());
                break;
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Month:");
        String month=sc.next();
        try{
            Month m=Month.valueOf(month.toUpperCase());
            showDetails(m);
        }
        catch(IllegalArgumentException e){
            System.out.println("Invalid Month Name");
        }
    }
}
