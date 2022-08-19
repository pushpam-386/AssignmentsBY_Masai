import java.io.Serializable;

public class Car implements Serializable {
    private int numberOfPassengers;
    private int numberOfKms;

    public int getNumberOfPassengers(){
        return numberOfPassengers;
    }
    public int getNumberOfKms(){
        return numberOfKms;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    public void setNumberOfKms(int numberOfKms) {
        this.numberOfKms = numberOfKms;
    }
}
