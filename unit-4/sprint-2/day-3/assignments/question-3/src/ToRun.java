public class ToRun implements Runnable{
    @Override
    public void run() {
        Pokemon obj=new Pokemon();
        obj.even();
        obj.odd();
    }
}
