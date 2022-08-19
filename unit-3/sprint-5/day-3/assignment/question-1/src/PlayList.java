import java.util.ArrayList;
import java.util.List;

public class PlayList {
    public List<Song> songs = new ArrayList<>();
    public void addSong(Song song){
        if (songs.contains(song)){
            System.out.println("Already Added into list");
        }
        else {
            songs.add(song);
            System.out.println("Song added to the playlist successfully.");
        }
    }
}
