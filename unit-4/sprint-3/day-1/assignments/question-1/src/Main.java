import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Student student=new Student();
        student.setEmail("pushpamtfs@gmai.com");
        student.setName("Pushpam Kumar");
        student.setRoll(1501386);
        student.setPassword("dog");
        student.address.setCity("Patna");
        student.address.setPincode("800025");
        student.address.setState("Bihar");

        File f1=new File("C://Users//VIKAS//Desktop//read&write//student.txt");
        f1.createNewFile();

        FileOutputStream fo=new FileOutputStream("C://Users//VIKAS//Desktop//read&write//student.txt");
        ObjectOutputStream obj=new ObjectOutputStream(fo);

        obj.writeObject(student);
        obj.close();

        FileInputStream fi=new FileInputStream("C://Users//VIKAS//Desktop//read&write//student.txt");
        ObjectInputStream obj1=new ObjectInputStream(fi);

        Object o=obj1.readObject();
        Student s1=(Student) o;

        System.out.println(s1.getName()+s1.getEmail()+"   "+s1.getPassword());

        obj1.close();

    }
}