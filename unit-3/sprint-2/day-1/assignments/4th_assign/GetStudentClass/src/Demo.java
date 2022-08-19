public class Demo {

    public static void main(String[] args) {
        StudentClassCollege student1=new StudentClassCollege();
        student1.collegeName="Kiit";
        student1.roll=151387;
        student1.address="BBS";
        student1.name="Ankur";

        StudentClassCollege student2=new StudentClassCollege(1501387,"kiit","BBS","Rajan");

        student1.showDetails();
        student2.showDetails();
        System.out.println(student1.getAddress());
    }

}
