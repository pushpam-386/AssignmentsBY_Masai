import java.text.DateFormat;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.Period;

public class Wage {

    public void calWage(String start,String end) throws InvalidFormatException{
          try {
              LocalDate ld=LocalDate.parse(start);
              LocalDate dr=LocalDate.parse(end);
          }
          catch (DateTimeException dateTimeException){
              throw dateTimeException;
          }

          if(LocalDate.parse(start).isAfter(LocalDate.now())){
              InvalidFormatException invalidFormatException=new InvalidFormatException("Enter correct Date ");
              throw  invalidFormatException;
          } else if (LocalDate.parse(end).isAfter(LocalDate.now())) {
              InvalidFormatException invalidFormatException=new InvalidFormatException("Enter Correct Date ");
              throw invalidFormatException;
          }
        LocalDate ld=LocalDate.parse(start);
        LocalDate dr=LocalDate.parse(end);
        Period period=Period.between(ld,dr);
        int years=period.getYears();

        System.out.println(years);

    }

}
