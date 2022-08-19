import java.io.Serializable;
import java.util.Comparator;

public class StudentComp implements Comparator<Student>, Serializable {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getStudentId()-o2.getStudentId();
    }
}
