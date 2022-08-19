import java.io.Serializable;

public class Address implements Serializable {
    private String state;
    private String city;
    private String pinCode;

    public Address() {

    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPinCode() {
        return pinCode;
    }

    public void setPincode(String pincode) {
        this.pinCode = pinCode;
    }
}
