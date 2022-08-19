import java.util.Comparator;

public class RollComparator implements Comparator<Students> {
    @Override
    public int compare(Students o1, Students o2) {
        if (o1.rollNo>o2.rollNo){
            return 1;
        } else if (o1.rollNo<o2.rollNo) {
            return -1;
        }
        else {
            return 0;
        }
    }
}
