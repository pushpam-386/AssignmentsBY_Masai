public class PermanentEmployee extends Employee{
    private double basicPay;


    public PermanentEmployee(Integer employeeId, String employeeName, double basicPay){
        super(employeeId,employeeName);
        this.basicPay=basicPay;
    }
    @Override
    public void calculateSalary(){
        double pfAmount=basicPay*0.12;
        salary= basicPay-pfAmount;
    }




}
