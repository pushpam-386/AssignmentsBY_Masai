import java.util.Scanner;

public class Main implements Runnable {
    int p=1;

    public static void main(String[] args) throws InterruptedException {

        Main m=new Main();
        Thread t1=new Thread(m);
        t1.start();

    }

    @Override
    public void run() {
        for(int i=1;i<11;i++){
            if(i==6){
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            System.out.println(i);
        }
    }
}






