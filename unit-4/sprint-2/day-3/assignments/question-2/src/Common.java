public class Common implements Runnable{
    public void fun1(){
        System.out.println("Inside function-1");
        synchronized (Common.class){
            System.out.println("Inside synchronized:-");
            System.out.println("1");
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Out of Sync");
    }

    @Override
    public void run() {
        this.fun1();
    }
}
