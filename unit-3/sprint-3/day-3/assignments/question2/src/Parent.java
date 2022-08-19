public class Parent {
    final int number;

    void method1(){
        System.out.println("parent method 1");
    }
    final void method2(){
        System.out.println("parent method 2");
    }
    void method3(){
        System.out.println("parent method 3");
    }
    public Parent(int number){
        this.number = number;
    }
}
