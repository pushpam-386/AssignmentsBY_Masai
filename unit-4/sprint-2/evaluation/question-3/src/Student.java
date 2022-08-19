import java.io.Serializable;

public class Student implements Serializable {
    private int rollNumber;
    private String name;
    private int marks;

    public Student(){

    }

    public Student(int rollNumber, String name, int marks) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.marks = marks;
    }

    public int getRollNumber(){
        return rollNumber;
    }

    public int getMarks(){
        return marks;
    }

    public String getName(){
        return name;
    }
}
