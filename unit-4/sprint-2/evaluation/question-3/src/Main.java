import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Student> students=new ArrayList<>();
        students.add(new Student(12,"A",495));
        students.add(new Student(13,"B",230));
        students.add(new Student(10,"C",210));
        students.add(new Student(6,"D",400));
        students.add(new Student(2,"E",352));

        Comparator<Student> compareByRollNumber=
                (Student o1,Student o2) -> o1.getRollNumber() - o2.getRollNumber();

        Collections.sort(students,compareByRollNumber);

        List<Student> goodStudents=students.stream().filter(student -> student.getMarks()<250)
                .collect(Collectors.toList());
        for (Student student:goodStudents) {
            System.out.println("Roll_no.= "+student.getRollNumber()+","+"Marks= "+student.getMarks()+","+"Name= "+student.getName());
        }
    }
}