import java.util.ArrayList;

/**
 * @author Jack Hyatt
 */
public class FrenchState implements State{
    private MusicBox musicBox;

    public FrenchState(MusicBox box) {
        this.musicBox = box;
    }

    public void pressStarButton() {

        ArrayList<String> lyrics = new ArrayList<String>();
        lyrics.add("Scintille, scintille, petite étoile");
        lyrics.add("Comment je me demande ce que vous êtes");
        lyrics.add("Au-dessus du monde si haut");
        lyrics.add("Comme un diamant dans le ciel");
        lyrics.add("Scintille, scintille, petite étoile");
        lyrics.add("Comment je me demande ce que vous êtes");

        musicBox.playSong("Scintille, scintille, petite étoile", lyrics);
    }

    public void pressHappyButton() {

        ArrayList<String> lyrics = new ArrayList<String>();
        lyrics.add("Si tu es heureux et que tu le sais, tape dans tes mains");
        lyrics.add("Si tu es heureux et que tu le sais, tape dans tes mains");
        lyrics.add("Si tu es content et que tu le sais");
        lyrics.add("Et tu veux vraiment le montrer");
        lyrics.add("Si tu es heureux et que tu le sais, tape dans tes mains");

        musicBox.playSong("Si tu es content et que tu le Sais", lyrics);
    }

    public void pressEnglishButton() {
        musicBox.setState(musicBox.getEnglishState());
    }

    public void pressFrenchButton() {
        System.out.println("Portia est une si bonne enseignante");
    }

    public void pressSpanishButton() {
        musicBox.setState(musicBox.getSpanishState());
    }
}
