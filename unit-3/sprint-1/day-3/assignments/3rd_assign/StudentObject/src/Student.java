public class Student {
    int roll;
    String name;
    int marks;

    public void displayStudentDetails(String name,int roll,int marks){
        System.out.println("Student name= "+name+", roll no.= "+roll+"and marks = "+marks);
    }

    public static void main(String[] args) {
        Student obj1=new Student();
        Student obj2=new Student();
        Student obj3=new Student();

        obj1.name="raja";
        obj1.roll=29;
        obj1.marks=67;

        obj2.name="Pushpam";
        obj2.roll=30;
        obj2.marks=79;

        obj3.name="binny";
        obj3.roll=31;
        obj3.marks=87;



        obj1.displayStudentDetails(obj1.name,obj1.roll,obj1.marks);
        obj2.displayStudentDetails(obj2.name,obj2.roll,obj2.marks);
        obj3.displayStudentDetails(obj3.name,obj3.roll,obj3.marks);


    }
}
