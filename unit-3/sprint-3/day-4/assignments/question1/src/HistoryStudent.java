public class HistoryStudent extends Student{
    int historyMarks;
    int civicsMarks;

    public HistoryStudent(int historyMarks,int civicsMarks){
        this.historyMarks=historyMarks;
        this.civicsMarks=civicsMarks;
    }

    @Override
    public double getPercentage() {
        return ((historyMarks+civicsMarks)/2);
    }
}
