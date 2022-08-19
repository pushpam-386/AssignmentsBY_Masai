import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Set<Song> hs = new HashSet<>();
        System.out.println("No. of input to be Entered: ");
        int input=scanner.nextInt();
        for (int i=1;i<=input;i++){
            System.out.println("Enter Movie Name: ");
            String movie=scanner.next();
            System.out.println("Enter Song Name: ");
            String song=scanner.next();
            Song song1=new Song(movie,song);
            hs.add(song1);
        }
        for(Song song: hs){
            song.play();
        }

    }
}