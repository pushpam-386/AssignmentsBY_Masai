import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Set<Product> listed1=new TreeSet<>(new ProductIdComp());
        Set<Product> listed2=new TreeSet<>(new ProductPriceComp());
        Set<Product> listed3=new TreeSet<>(new ProductNameComp());
        System.out.println("No. of Student Details to be Entered: ");
        int count=sc.nextInt();
        for(int i=0;i<count;i++){
            System.out.println("Enter ProductId:");
            int id=sc.nextInt();
            System.out.println("Enter Product name: ");
            String name=sc.next();
            System.out.println("Enter Product Price: ");
            double price=sc.nextDouble();
            Product product=new Product(id,name,price);
            listed1.add(product);
            listed2.add(product);
            listed3.add(product);
        }
        System.out.println("Enter choice of Product to be shown: ");
        int input=sc.nextInt();
        if(input==2){
            for(Product p:listed3){
                System.out.println(p.getProductName()+" "+p.getProductId()+" "+p.getProductPrice());
            }
        }

        else if(input==1){
            for(Product p:listed2){
                System.out.println(p.getProductName()+" "+p.getProductId()+" "+p.getProductPrice());
            }
        }
        else{
            for(Product p:listed1){
                System.out.println(p.getProductName()+" "+p.getProductId()+" "+p.getProductPrice());
            }
        }
    }
}