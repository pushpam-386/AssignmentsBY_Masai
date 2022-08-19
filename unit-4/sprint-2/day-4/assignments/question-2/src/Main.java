import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        Product[] obj={
                new Product(6),
                new Product(7),
                new Product(8),
                new Product(9),
        };
        ExecutorService service = Executors.newFixedThreadPool(3);
        for(Product job:obj){
            service.submit(job);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        service.shutdown();
    }
}



