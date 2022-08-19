public class CitySwitchCase {
    static String city="mumbai";

    public static void setCity(String city) {
        switch (city){
            case "banglore":
                System.out.println("banglore");
                break;

            case "patna":
                System.out.println("patna");
                break;

            case "mumbai":
                System.out.println("mumbai");
                break;

            case "none":
                System.out.println("none");
        }
    }

    public static void main(String[] args) {
        CitySwitchCase obj=new CitySwitchCase();
        obj.setCity("mumbai");
    }
}
