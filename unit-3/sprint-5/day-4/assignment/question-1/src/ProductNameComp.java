import java.util.Comparator;

public class ProductNameComp implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        int result =o1.getProductName().compareTo(o2.getProductName());
        if(result>1)
            return 1;
        if(result<1)
            return -1;
        return result;
    }
}
