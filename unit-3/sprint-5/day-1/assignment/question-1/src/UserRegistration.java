import  java.util.Scanner;
public class UserRegistration {

    String userName;
    String userCountry;
    public UserRegistration(String userName,String userCountry){
        this.userName=userName;
        this.userCountry=userCountry;
    }
    public void registerUser(String userName,String userCountry) throws InvalidCountryException{
        if (userCountry.equals("India")){
            System.out.println("User registration done successfully");
        }
        else {
            InvalidCountryException ice=new InvalidCountryException("User Outside India cannot be registered");
            throw ice;
        }
    }

    public static void main(String[] args) throws InvalidCountryException{
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Name");
        String name=sc.next();
        System.out.println("Enter your Country");
        String country=sc.next();

        UserRegistration obj=new UserRegistration(name,country);

        try {
            obj.registerUser(name,country);
        }catch (InvalidCountryException ice){
            System.out.println(ice.getMessage());
        }

    }
}
