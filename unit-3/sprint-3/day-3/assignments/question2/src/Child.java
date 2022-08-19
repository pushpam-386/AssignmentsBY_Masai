public final class Child extends Parent {
    public Child(int number) {
        super(number);
    }

    @Override
    void method1(){
        System.out.println("child method 1, number value = "+ this.number);
    }
    void method4(){
        System.out.println("child method 4");
    }
}
