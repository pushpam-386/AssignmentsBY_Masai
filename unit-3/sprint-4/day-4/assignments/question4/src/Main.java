import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Start of Main");
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter an integer:");
            String integer = sc.nextLine();
            int intt = Integer.parseInt(integer);
            int sqr = intt * intt;
            System.out.println("End of code Main");
        } catch (NumberFormatException e) {
            throw new RuntimeException(e);
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}