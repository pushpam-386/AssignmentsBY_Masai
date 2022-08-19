import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;
public class Demo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your date of birth in dd-mm-yyyy format: ");
        String dob=sc.next();
        checkEligibility(dob);
    }

    private static void checkEligibility(String dob){
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd-MM-yyyy");
        try{
            LocalDate dateOfBirth =LocalDate.parse(dob,formatter);
            LocalDate today=LocalDate.now();

            if(dateOfBirth.isAfter((today))){
                System.out.println("Date of birth should not be in future");
                return;
            }

            Period period=Period.between(today,dateOfBirth);
            int years =Math.abs(period.getYears());
            int months =Math.abs(period.getMonths());
            int days =Math.abs(period.getDays());

            if(years>=18&& months==0 && days==0){
                System.out.println("Happy Birthday, you are eligible to cast your vote.");
            }
            else if(years>=18){
                System.out.println("you are eligible to cast your vote.");
            }
            else{
                System.out.println("You are not eligible to cast your vote. ");
            }
        }
        catch (Exception e){
            System.out.println("Please pass the date in the proper format.");
            System.out.println(e);
        }
    }
}
