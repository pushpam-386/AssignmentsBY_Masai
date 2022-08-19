import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;
public class Main {

    public void dOB(String dob) throws DateTimeException, InvalidDateFormat {
        try {
            LocalDate localDate = LocalDate.parse(dob);
            if (localDate.isAfter(LocalDate.now())) {
                InvalidDateFormat invalidDateFormat = new InvalidDateFormat("Age should not be in the future");
                throw invalidDateFormat;
            }
            else{
                Period period=Period.between(localDate,LocalDate.now());
                int years = period.getYears();
                int months = period.getMonths();
                double yearsInDecimal = years + months / 12;
                System.out.println("Age: -> "+yearsInDecimal+months);
            }
        }
        catch (DateTimeException dte){
            throw dte;

        } catch (InvalidDateFormat e) {
            throw e;
        }
    }

    public static void main(String[] args) throws InvalidDateFormat,DateTimeException {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter date of birth: ");
        String dob=sc.next();
        Main obj=new Main();
        try {
            obj.dOB(dob);
        }
        catch (DateTimeException dateTimeException){
            System.out.println(dateTimeException.getMessage());
        }
        catch (InvalidDateFormat e) {
            System.out.println(e.getMessage());
        }
    }
}