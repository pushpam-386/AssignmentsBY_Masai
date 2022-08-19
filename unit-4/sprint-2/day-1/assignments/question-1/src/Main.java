import java.util.Scanner;

public class Main implements Runnable {
   int p=1;

    public static void main(String[] args) throws InterruptedException {

        Main m=new Main();
        Thread t1=new Thread(m);
        t1.start();
        t1.join();

        System.out.println(m.p);
    }

    @Override
    public void run() {
        for(int i=10;i>0;i--){
            p*=i;
        }
    }
}






