import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        FileReader fr=new FileReader("C://Users//VIKAS//Desktop//read&write//abc.txt");
        BufferedReader bf=new BufferedReader(fr);
        String i=bf.readLine();
        int count = 0;
        while(i != null){
            for(int p=0;p<i.length();p++){
                if(i.charAt(p)=='r'){
                    count++;
                }
            }
            i=bf.readLine();
        }
        System.out.println("File 'abc.txt' has "+count+" instances of letter 'r'.");
        bf.close();
    }
}