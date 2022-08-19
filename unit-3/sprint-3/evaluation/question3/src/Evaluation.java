public abstract class Evaluation {
    private final int numberOfQuestions;

    public Evaluation(int numberOfQuestions) {
        this.numberOfQuestions = numberOfQuestions;
    }
    abstract void evaluationTiming();
    void printNoOfQuestions(){
        System.out.println("No. of questions in Evaluation is:"+numberOfQuestions);
    }
}
