import java.util.ArrayList;

/**
 * @author Jack Hyatt
 */
public class EnglishState implements State{
    private MusicBox musicBox;

    public EnglishState(MusicBox box) {
        this.musicBox = box;
    }

    public void pressStarButton() {

        ArrayList<String> lyrics = new ArrayList<String>();
        lyrics.add("Twinkle twinkle, little star.");
        lyrics.add("How I wonder what you are.");
        lyrics.add("Up above the world so high");
        lyrics.add("Like a dimond in the sky");
        lyrics.add("Twinkle twinkle little star");
        lyrics.add("How I wonder what you are");

        musicBox.playSong("Twinkle Twinkle Little Star", lyrics);
    }

    public void pressHappyButton() {

        ArrayList<String> lyrics = new ArrayList<String>();
        lyrics.add("If you're happy and you know it clap your hands");
        lyrics.add("If you're happy and you know it clap your hands");
        lyrics.add("If you're happy and you know it");
        lyrics.add("And you really want to show it");
        lyrics.add("If you're happy and you know it clap your hands");

        musicBox.playSong("If You're Happy and You Know It", lyrics);
    }

    public void pressEnglishButton() {
        System.out.println("You are already in English mode");
    }

    public void pressFrenchButton() {
        musicBox.setState(musicBox.getFrenchState());
    }

    public void pressSpanishButton() {
        musicBox.setState(musicBox.getSpanishState());
    }
}
