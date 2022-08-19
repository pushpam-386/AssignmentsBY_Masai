import java.io.Serializable;
import java.util.Objects;

public class Student implements Serializable {
    private int studentId;
    private String studentName;
    private String studentAddress;
    private String student_email;
    transient private String studentPassword;

    public Student() {
    }


    public Student(int studentId, String studentName, String studentAddress, String student_email, String studentPassword) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentAddress = studentAddress;
        this.student_email = student_email;
        this.studentPassword = studentPassword;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }

    public String getStudent_email() {
        return student_email;
    }

    public void setStudent_email(String student_email) {
        this.student_email = student_email;
    }

    public String getStudentPassword() {
        return studentPassword;
    }

    public void setStudentPassword(String studentPassword) {
        this.studentPassword = studentPassword;
    }


}
