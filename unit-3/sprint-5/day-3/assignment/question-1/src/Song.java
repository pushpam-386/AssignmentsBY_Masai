import java.util.Objects;

public class Song {

    private String movieName;
    private String movieSong;


    public Song(String movieName,String movieSong){
        this.movieName=movieName;
        this.movieSong=movieSong;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Song song = (Song) o;
        return movieName.equals(song.movieName) && Objects.equals(movieSong, song.movieSong);
    }

    @Override
    public int hashCode() {
        return Objects.hash(movieName, movieSong);
    }

    public void play(){
        System.out.println(movieSong+" of "+movieName+" is playing...!");
    }

}
