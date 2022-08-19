import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Employee employee=new Employee();
        employee.setName("Pushpam");
        employee.setDateOfBirth("24-01-1998");
        employee.setDepartment("Infosys");
        employee.setDesignation("Associate business Analyst");
        employee.setSalary(38000);
        File f=new File("C://Users//Vikas//Desktop//read&write//OutObject.txt");
        f.createNewFile();
        FileOutputStream fo=new FileOutputStream("C://Users//Vikas//Desktop//read&write//OutObject.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fo);
        oos.writeObject(employee);
        oos.flush();
        oos.close();

        FileInputStream fi=new FileInputStream("C://Users//Vikas//Desktop//read&write//OutObject.txt");
        ObjectInputStream ois=new ObjectInputStream(fi);
        Object obj=ois.readObject();
        Employee emp=(Employee) obj;
        System.out.println("Name: "+emp.getName()+"  Salary:  "+emp.getSalary()+"  DOF:  "+emp.getDateOfBirth()+"  Department:  "+emp.getDepartment()+"  Designation: "+emp.getDesignation());
        ois.close();
    }
}