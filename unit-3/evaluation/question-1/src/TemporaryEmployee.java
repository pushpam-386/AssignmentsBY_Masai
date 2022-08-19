public class TemporaryEmployee extends Employee{

    private Integer hoursWorked;
    private Integer hourlyWages;

    public TemporaryEmployee(Integer employeeId, String employeeName,Integer hoursWorked,Integer hourlyWages) {
        super(employeeId, employeeName);
        this.hourlyWages=hourlyWages;
        this.hoursWorked=hoursWorked;
    }

   @Override
    public  void calculateSalary(){
        salary=hourlyWages*hoursWorked;
   }

}
