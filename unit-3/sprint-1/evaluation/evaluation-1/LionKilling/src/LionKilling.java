public class LionKilling {
    String name;
    boolean isHungry;
    int age;
    static int totalDeaths=0;
    public static void printKillings(int totalDeaths){
        System.out.println("Total killings by lions in jungle = "+totalDeaths);
    }
    public void thinking(boolean isHungry,String name,int age){
        if(isHungry==true&age>12){
            totalDeaths+=2;
            System.out.println(name+"has eaten two animal");
        } else if (isHungry==true&age>=12&age>=2) {
            totalDeaths+=1;
            System.out.println(name+"lion2 has eaten one animal");
        }
        else if(isHungry==true&age<=2) {
            totalDeaths += 1;
            System.out.println(name + "is calling Mom");
        }
    }

    public static void main(String[] args) {
        LionKilling obj1 = new LionKilling();
        LionKilling obj2 = new LionKilling();
        LionKilling obj3 = new LionKilling();
        LionKilling obj4 = new LionKilling();



        obj1.name="lion1";
        obj1.isHungry=false;
        obj1.age=10;

        obj2.name="lion2";
        obj2.isHungry=true;
        obj2.age=14;

        obj3.name="lion3";
        obj3.isHungry=false;
        obj3.age=8;



        obj1.thinking(obj1.isHungry,obj1.name,obj1.age);
        obj2.thinking(obj2.isHungry,obj2.name,obj2.age);
        obj3.thinking(obj3.isHungry,obj3.name,obj3.age);

        printKillings(totalDeaths);
    }
}




