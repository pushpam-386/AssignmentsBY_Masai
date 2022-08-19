public class ZImpl implements Z{

    @Override
    public void x() {
        System.out.println("override z in class");
    }

    @Override
    public void y() {
        Z.super.y();
        System.out.println("override Y in Z");
    }

    @Override
    public void x1() {

    }

    @Override
    public void z() {

    }


    @Override
    public void y1() {
        Z.super.y1();
    }
}
