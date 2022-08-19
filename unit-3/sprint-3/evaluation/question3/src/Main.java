public class Main {
    public static void msgToStudents(Evaluation evaluation){
        if(evaluation instanceof DsaEvaluation){
            System.out.println("Is a dsa evaluation");

        }
        else{
            System.out.println("its a coding Evaluation");
        }
        evaluation.evaluationTiming();
        evaluation.printNoOfQuestions();
    }

    public static void main(String[] args) {
        msgToStudents(new DsaEvaluation(5));
        msgToStudents(new CodingEvaluation(4));
    }
}
