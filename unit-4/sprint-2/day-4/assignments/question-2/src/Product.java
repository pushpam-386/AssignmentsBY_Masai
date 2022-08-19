public class Product implements Runnable{
    int top;

    public Product(int top) {
        this.top = top;
    }

    public void yeild(){
        System.out.println("Get result: ");

        for(int i=0;i<top;i++){
            System.out.println(i);
        }
    }

    @Override
    public void run() {
        yeild();
    }
}
