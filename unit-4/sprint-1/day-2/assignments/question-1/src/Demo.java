public class Demo {
    public static void main(String[] args) {
        OwnGenricsClass<String> made=new OwnGenricsClass<>();
        made.add("Pushpam");
        System.out.println(made.get());

        OwnGenricsClass <Integer> made1=new OwnGenricsClass<>();
        made1.add(1);
        made1.add(2);
        made1.add(3);
        System.out.println(made1.get());
    }
}