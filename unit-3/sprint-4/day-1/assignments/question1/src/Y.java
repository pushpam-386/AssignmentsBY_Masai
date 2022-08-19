public interface Y {
    void x1();

    default void y1(){
        System.out.println("default method in Y");
    }
    public static void z(){
        System.out.println("static method in Y");
    }
}
