public class Main {
    public static void main(String[] args) {
        EmployeeBonus employeeBonus=new EmployeeBonus();
        try {
            employeeBonus.bonus("20");
        }
        catch (InvalidAgeexception invalidAgeexception){
            System.out.println(invalidAgeexception.getMessage());
        }
    }
}