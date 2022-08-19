import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Employee obj1=new Employee();
        Address adre=new Address();
        adre.setState("Bihar");
        adre.setCity("Patna");
        adre.setPincode(800025);
        obj1.setAddress(adre);


        obj1.setEmail("push@");
        obj1.setEmpId(123);
        obj1.setEmpName("pushpam");
        obj1.setPassword("Cat");

        File f=new File("C://Users//VIKAS//Desktop//read&write//emp.txt");
        f.createNewFile();

        FileOutputStream fos=new FileOutputStream("C://Users//VIKAS//Desktop//read&write//emp.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(obj1);
        oos.flush();
        oos.close();

        FileInputStream fis=new FileInputStream("C://Users//VIKAS//Desktop//read&write//emp.txt");
        ObjectInputStream ois=new ObjectInputStream(fis);

        Object o=ois.readObject();
        Employee employee=(Employee) o;
        System.out.println( employee.getAddress().getState()+
                employee.getAddress().getPincode()+
                employee.getAddress().getCity()+

                employee.getEmpId()+
                employee.getPassword()+
                employee.getEmpName()+
                employee.getEmail());
    }
}