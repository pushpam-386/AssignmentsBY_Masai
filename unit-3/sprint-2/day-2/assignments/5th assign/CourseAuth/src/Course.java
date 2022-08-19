import java.util.Scanner;
public class Course {
    int courseId;
    String courseName;
    int courseFee;
    static String userName="Admin";
    static String password="1234";

    public void displayCourseDetails(int courseId,String courseName,int courseFee){
        System.out.println(courseId);
        System.out.println(courseName);
        System.out.println(courseFee);
    }

    public static void authenticate(String passwordInp,String userNameInp){
        if(passwordInp.equals(password) && userNameInp.equals(userName)){
            Course obj1=new Course();
            obj1.courseName="KIIT";
            obj1.courseId=12345;
            obj1.courseFee=40000;
            System.out.println(obj1.courseName);
            System.out.println(obj1.courseId);
            System.out.println(obj1.courseFee);
        }
        else{
            System.out.println("Invalid user nd Password");
        }
    }

    public static void main(String[] args) {
        Course C=new Course();
        C.courseFee=30000;
        C.courseId=1234;
        C.courseName="masai";
        C.displayCourseDetails(C.courseId,C.courseName,C.courseFee);
        System.out.println("Enter userName");
        Scanner sc = new Scanner(System.in);
        String userNameInp = sc.nextLine();
        System.out.println("Enter Password");
        Scanner sc1 = new Scanner(System.in);
        String passwordInp = sc.nextLine();
        Course auth=new Course();
        authenticate(passwordInp,userNameInp);
    }
}
