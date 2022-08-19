import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
       File file=new File("C://Users//VIKAS//Desktop//read&write");
       file.mkdir();
       System.out.println(file.exists());

       File filecreater=new File("C://Users//VIKAS//Desktop//read&write//abc.txt");
       filecreater.createNewFile();


       FileWriter fileWriter=new FileWriter("C://Users//VIKAS//Desktop//read&write//abc.txt");
       char[] chhr={'a','b','c'};
       fileWriter.write(chhr);
       fileWriter.write(100);
       fileWriter.write("\n");
       fileWriter.write("Pushpam");
       fileWriter.flush();
       fileWriter.close();
       File f=new File("C://Users//VIKAS//Desktop//read&write//abc.txt");
       FileReader fileReader=new FileReader(f);
       char[] chr=new char[(int)f.length()];
       fileReader.read(chr);
       for(char c:chr){
          System.out.print(c);
       }

    }
}