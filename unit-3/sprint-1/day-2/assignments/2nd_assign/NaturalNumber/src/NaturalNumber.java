public class NaturalNumber{
    public static void naturalNumber(int x) {
        int i= 2;
        int b= x*(x+1);
        int c=b/2;
        System.out.println("sum of N natural numbers: = " + c);
    }

    public static void main(String[] args) {
        int n=5;
        naturalNumber(n);
    }
}

