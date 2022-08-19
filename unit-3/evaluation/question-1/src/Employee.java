public abstract class Employee {
    protected Integer employeeId;
    protected String employeeName;
    protected double salary;



    public Employee(Integer employeeId,String employeeName){
        this.employeeId=employeeId;
        this.employeeName=employeeName;
    }

    public abstract void calculateSalary();
}
