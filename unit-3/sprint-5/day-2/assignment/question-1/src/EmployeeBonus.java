import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.Period;

public class EmployeeBonus {
    public double bonus(String joiningDate) throws InvalidAgeexception {
        try {
            LocalDate joiningDateLocal = LocalDate.parse(joiningDate);
            if (joiningDateLocal.isAfter(LocalDate.now())) {
                InvalidAgeexception invalidAgeexception = new InvalidAgeexception("Age should not be in the future");
                throw invalidAgeexception;
            }
            Period experience = Period.between(joiningDateLocal, LocalDate.now());
            int years = experience.getYears();
            int months = experience.getMonths();
            double yearsInDecimal = years + months / 12;
            if (yearsInDecimal < 1) {
                return 500;
            } else if (yearsInDecimal >= 1 && yearsInDecimal < 2) {
                return 8000;
            } else {
                return 10000;
            }

        } catch (DateTimeException e) {
            throw new InvalidAgeexception("Invalid Format");
        }

    }
}
