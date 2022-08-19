import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        PlayList playList=new PlayList();
        for (int i=0;i<4;i++){
            System.out.println("Enter Song Name: ");
            String song=scanner.next();
            System.out.println("Enter Movie Name: ");
            String movie=scanner.next();
            playList.addSong(new Song(movie,song));
        }

        for (Song song: playList.songs) {
            song.play();
        }
    }
}