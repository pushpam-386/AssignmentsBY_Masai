import java.util.ArrayList;
import java.util.List;

public class OwnGenricsClass <T>{
    T obj;


    void add(T obj){
        this.obj=obj;
    }
    T get(){
        return obj;
    }

}
