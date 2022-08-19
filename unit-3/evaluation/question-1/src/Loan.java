public class Loan{

//    private Loan(){
//
//    }

//    public static Loan getObject(){
//        return
//    }


    public double calculateLoanAmount(Employee employeeObj) {
        employeeObj.calculateSalary();
        if (employeeObj instanceof PermanentEmployee) {
            return (employeeObj.salary * .15);
        } else if (employeeObj instanceof TemporaryEmployee) {
            return (employeeObj.salary * .10);
        }
        return 0.1*employeeObj.salary;
    }
}
