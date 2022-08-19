public class StudentCheckList {
    int roll;
    String name;
    int age;
    int marks;

    public void check(int age,int marks){
        if(age>18&&age<60&&marks>0&&marks<500){
            System.out.println("They are in valid age and marks");
        }
    }

    StudentCheckList(){
        this.name="Pushpam";
        this.age=24;
        this.marks=79;
        this.roll=1155;

        check(age,marks);
        System.out.println("zero-argument constructor");
    }

    StudentCheckList(String name,int roll,int age,int marks){
        check(age,marks);
        System.out.println("Parameterised Constructor");
    }

    public static void main(String[] args) {
        StudentCheckList obj1=new StudentCheckList();
        obj1.marks=356;
        obj1.age=25;
        obj1.roll=1133;
        obj1.name="Push";

        StudentCheckList obj3=new StudentCheckList(obj1.name,obj1.roll,obj1.age,obj1.marks);
    }
}
