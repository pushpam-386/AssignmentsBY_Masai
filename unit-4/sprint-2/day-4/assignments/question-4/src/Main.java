import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("C://Users//VIKAS//Desktop//read&write//abc.text");
        FileOutputStream fos = new FileOutputStream("C://Users//VIKAS//Desktop//read&write//abcd.text");
        int i = fis.read();
        while (i != -1) {
            fos.write(i);
            i = fis.read();
        }
        fos.flush();
        fos.close();
        fis.close();
    }
}