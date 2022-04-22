import java.util.regex.Pattern;

public class SongAdapter extends Song {
    private Tune tune;
    
    /**
     * Contructor
     * @param tune: the tune to turn into a song
     */
    public SongAdapter(Tune tune) {
        this.tune = tune;
    }

    public String getTitle() {
        return tune.getDisplayTitle().split(" : ")[0];
    }

    public String getAlbum() {
        return tune.getDisplayTitle().split(" : ")[1];
    }

    public String getArtistFirstName() {
        return tune.getArtistName().split(" ")[0];
    }

    public String getArtistLastName() {
        return tune.getArtistName().split(" ")[1];
    }

    /**
     * Get the genre by seeing if any of the song genres is contained in the oldie genre. Return other if not
     */
    public String getGenre() {
        String categ = tune.getCategory();
        for(Genre g : Genre.values()) {
            if(Pattern.compile(Pattern.quote(g.toString()), Pattern.CASE_INSENSITIVE).matcher(categ).find())
                return g.toString();
        }
        return Genre.OTHER.toString();
    }
}
