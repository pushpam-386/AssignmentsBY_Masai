public class Main {
    public static void main(String[] args) throws InterruptedException {
        ToRun toRun=new ToRun();
        Thread t1=new Thread(toRun);
        t1.start();
    }
}