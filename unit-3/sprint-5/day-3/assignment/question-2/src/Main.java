import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        List<String> hs = new ArrayList<>();
        System.out.println("No. of input to be Entered: ");
        int input=scanner.nextInt();
        for (int i=1;i<=input;i++){
            System.out.println("Enter Name: ");
            String name=scanner.next();
            hs.add(name);
        }
        printForEach(hs);
        printFor(hs);

        printIterator(hs);
    }

    private static void printIterator(List<String> hs) {
        Iterator itr = hs.iterator();

        while(itr.hasNext()) {
            String name = (String) itr.next();
            System.out.println(name);
        }
    }

    private static void printFor(List<String> hs) {
        for (int i = 0; i< hs.size(); i++){
            String name = hs.get(i);
            System.out.println(name);
        }
    }

    private static void printForEach(List<String> hs) {
        for(String name: hs){
            System.out.println(name);
        }
    }
}
