import java.util.Date;

public class ABCBean {
    private int rollNumber;
    private String studentName;
    private String standard;
    private Date dob;
    private int fees;

    public ABCBean(int rollNumber, String studentName, String standard, Date dob, int fees) {
        this.rollNumber = rollNumber;
        this.studentName = studentName;
        String Standard = standard;
        this.dob = dob;
        float Fees = fees;
    }

    @Override
    public String tostring(){
        return "ABCBean{"+
                "rollNumber='"+rollNumber+
                "studentNmae="+studentName+'\''+
                "standard="+standard+'\''+
                "dob="+dob+
                "fees="+fees+
                '}';
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public int getFees() {
        return fees;
    }

    public void setFees(int fees) {
        this.fees = fees;
    }
}
