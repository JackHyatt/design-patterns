public class Oldie implements Tune {
    private String artistName;
    private String songTitle;
    private String recordTitle;
    private String category;

    /**
     * Constructor
     */
    public Oldie(String artistName, String songTitle, String recordTitle, String category) {
        this.artistName = artistName;
        this.songTitle = songTitle;
        this.recordTitle = recordTitle;
        this.category = category;
    }


    public String getArtistName() {
        return this.artistName;
    }

    public String getDisplayTitle(){
        return this.songTitle +" : "+ this.recordTitle;
    }

    public String getCategory() {
        return this.category;
    }
}
