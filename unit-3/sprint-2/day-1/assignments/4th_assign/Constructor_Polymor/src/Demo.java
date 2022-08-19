public class Demo {
    String s;
    float f;
    int i;

    Demo(){
        System.out.println("No Para");
    }

    Demo(String s){
        System.out.println("Para:-"+s);

    }

    Demo(int i){
        System.out.println("Para:-"+i);

    }

    Demo(float f){
        System.out.println("Para:-"+f);
    }


    public static void main(String[] args) {
        Demo obj1=new Demo();
        obj1.s="push";
        obj1.f=44;
        obj1.i=67;
        
        Demo obj3=new Demo(obj1.s);
        Demo obj4=new Demo(obj1.i);
        Demo obj5=new Demo(obj1.f);
    }
}
