
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class StudentDB implements Serializable {
    Set<Student> studentsData=new TreeSet<>(new StudentComp());
    public void addStudent(Student student){
        studentsData.add(student);
    }

    public Set<Student> getStudentsData() {
        return studentsData;
    }

    public void setStudentsData(Set<Student> studentsData) {
        this.studentsData = studentsData;
    }
}
