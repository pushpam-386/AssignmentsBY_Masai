import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Student {
    private String name;
    private List<Integer> marks=new ArrayList<>();

    public Integer getTotalMarks(){
        return marks.stream()
                .collect(Collectors.summingInt(Integer::intValue));
    }

    public void addMarks(int x){
        marks.add(x);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Integer> getMarks() {
        return marks;
    }

    public void setMarks(List<Integer> marks) {
        this.marks = marks;
    }
}
