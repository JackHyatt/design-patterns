import java.util.HashMap;

public class JukeBox {
    private HashMap<String,Song> songs;
    private int currentSong; // bro what is this even for

    /**
     * Constructor sets the song hasmap
     */
    public JukeBox(){
        this.songs = new HashMap<String,Song>();
    }

    /**
     * Add songs to the hashmap
     * @param song: song to add
     */
    public void addSong(Song song) {
        songs.put(song.getTitle().toLowerCase(), song);
    }

    public void play(String songName) {
        Song nextSong = songs.get(songName.toLowerCase());
        if(nextSong==null){
            System.out.println("Sorry, this song isn't in the jukebox.");
            return;
        }
        System.out.println(nextSong.toString());
    }
}
