public interface Z extends Y,X{

    @Override
    default void x() {
        System.out.println("override both x and y in z");
    }

    @Override
    default void y() {
        System.out.println("override y in z");
    }

    @Override
    default void y1() {
        System.out.println("override y1 in z");
    }

    @Override
    default void x1() {
        System.out.println("override x1 in z");
    }


    void z();
}
