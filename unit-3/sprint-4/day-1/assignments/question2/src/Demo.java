import java.util.Scanner;
public class Demo {
    public Hotel provideFood(int amount) {
        if (amount > 1000) {
            return new TajHotel();

        }
        else{
            return new RoadSideHotel();
        }

    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter amount to be spent");
        int amount=sc.nextInt();
        if(amount<200){
            System.out.println("Enter a valid amount");
            System.exit(0);
        }
        Demo obj=new Demo();
        Hotel hotel=obj.provideFood(amount);
        hotel.masalaDosa();
        hotel.chickenBiryani();
    }

}
