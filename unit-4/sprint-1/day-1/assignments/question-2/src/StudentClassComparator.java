import java.util.Comparator;

public class StudentClassComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if(o1.getMarks() > o2.getMarks())
            return +1;
        else if(o1.getMarks() < o2.getMarks())
            return -1;
        else
            return 0;
    }
}
