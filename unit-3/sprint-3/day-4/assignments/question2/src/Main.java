public class Main {

    public static void main(String[] args) {
        Shape obj = new Area();
        int recArea = obj.rectangleArea(10, 15);
        int squArea = obj.squareArea(5);
        double cirArea = obj.circleArea(5);
        System.out.println(recArea);
        System.out.println(squArea);
        System.out.println(cirArea);
    }
}