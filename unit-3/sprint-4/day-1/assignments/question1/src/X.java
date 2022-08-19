public interface X {
    void x();
    default void y(){
        System.out.println("default method in X");
    }
    public static void z(){
        System.out.println("static method in X");
    }




}
