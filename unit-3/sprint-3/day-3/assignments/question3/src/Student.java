public class Student extends Person{
    int studentId;
    String courseEnrolled;
    int courseFee;

    public Student(String name, String gender, Address address, int studentId, String courseEnrolled, int courseFee) {
        super(name, gender, address);
        this.studentId = studentId;
        this.courseEnrolled = courseEnrolled;
        this.courseFee = courseFee;
    }
}
