import java.io.Serializable;

public class Employee implements Serializable {
    private int employeeId;
    private String employeeName;
    private double salary;
    private double netSalary;

    public Employee() {
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getNetSalary() {
        return netSalary;
    }

    public void setNetSalary(double netSalary) {
        this.netSalary = netSalary;
    }

    public void calculateNetSalary(int pfPercentage){
        double salary=getSalary();
        double netSalary=salary-pfPercentage;
        setNetSalary(netSalary);
    }
}

