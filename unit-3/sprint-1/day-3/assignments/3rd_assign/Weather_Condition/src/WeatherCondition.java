public class WeatherCondition {
    boolean isSnowing = false;
    boolean isRaining = false;
    double temperature = 60.0;

    public static void main(String[] args) {
        WeatherCondition obj1 = new WeatherCondition();
        WeatherCondition obj2 = new WeatherCondition();
        WeatherCondition obj3 = new WeatherCondition();

        if (obj1.isSnowing == true) {
            System.out.println("Stay Home");
        } else if (obj1.isRaining == true) {
            System.out.println("Stay Home");
        } else if (obj2.temperature < 50.0) {
            System.out.println("Stay Home");
        }
        else{
            System.out.println("Let's Go out");
        }
    }
}