public class Main {
    public static void main(String[] args) {
        Manager man1 = new Manager();
        man1.Name = "Pushpam";
        man1.Age = 24;
        man1.Phone_number = "754678888";
        man1.Address = "Patna";
        man1.Salary = 25000.0;

        Employee emp1 = new Employee();
        emp1.Name = "KUmar";
        emp1.Age = 25;
        emp1.Phone_number = "774678888";
        emp1.Address = "Patna10";
        emp1.Salary = 250008.0;

        emp1.printSalary(emp1.Age, emp1.Phone_number, emp1.Address, emp1.Name,emp1.Salary);
        man1.printSalary(man1.Age, man1.Phone_number, man1.Address, man1.Name,man1.Salary);
    }
}
