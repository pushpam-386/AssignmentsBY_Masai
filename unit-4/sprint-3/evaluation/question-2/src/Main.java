import java.io.*;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no. of input of students:  ");
        int n=sc.nextInt();
        StudentDB obj=new StudentDB();
        for(int i=0;i<n;i++) {
            System.out.println("Enter Students1 Details:  --> ");
            int id1 = sc.nextInt();
            String name1 = sc.next();
            String add1 = sc.next();
            String email1 = sc.next();
            String pass1 = sc.next();
            Student s1 = new Student(id1, add1, name1, email1, pass1);
            obj.addStudent(s1);

        }

        FileOutputStream fo=new FileOutputStream(new File("C:\\Users\\VIKAS\\Desktop\\pushpam_fw19_1155\\unit-4\\sprint-3\\evaluation\\question-2\\src\\dataBase.txt"));
        ObjectOutputStream oos=new ObjectOutputStream(fo);

        oos.writeObject(obj);
        oos.flush();
        oos.close();

        System.out.println("Obj Object of StudentDb class is Serialized");

        ObjectInputStream objectInputStream=new ObjectInputStream((new FileInputStream("C:\\Users\\VIKAS\\Desktop\\pushpam_fw19_1155\\unit-4\\sprint-3\\evaluation\\question-2\\src\\dataBase.txt")));
        StudentDB studentDB=(StudentDB) objectInputStream.readObject();

        for (Student s1:studentDB.getStudentsData()) {
            System.out.println("Student id: "+s1.getStudentId());
            System.out.println("Student email: "+s1.getStudent_email());
            System.out.println("Student Address: "+s1.getStudentAddress());
            System.out.println("Student Password"+s1.getStudentPassword());
            System.out.println("Student Name: "+s1.getStudentName());
        }
    }
}