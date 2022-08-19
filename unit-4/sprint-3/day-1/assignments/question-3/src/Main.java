import java.io.*;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        File file=new File(str);
        FileReader fr=new FileReader(file);
        char[] chr=new char[(int)file.length()];
        fr.read(chr);

        for (char c:chr) {
            System.out.println(c);
        }
    }
}