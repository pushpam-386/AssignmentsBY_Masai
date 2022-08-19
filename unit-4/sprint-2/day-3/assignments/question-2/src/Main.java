public class Main {
    public static void main(String[] args) {
        Common c1=new Common();
        Thread t1=new Thread(c1);
        Thread t2=new Thread(c1);
        t1.start();
        t2.start();
    }
}