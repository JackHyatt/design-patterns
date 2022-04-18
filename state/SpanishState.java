import java.util.ArrayList;

/**
 * @author Jack Hyatt
 */
public class SpanishState implements State{
    private MusicBox musicBox;

    public SpanishState(MusicBox box) {
        this.musicBox = box;
    }

    public void pressStarButton() {

        ArrayList<String> lyrics = new ArrayList<String>();
        lyrics.add("Brilla brilla pequeña estrella");
        lyrics.add("Cómo me pregunto lo que eres");
        lyrics.add("Por encima del mundo tan arriba");
        lyrics.add("Como un diamante en el cielo");
        lyrics.add("Brilla brilla pequeña estrella");
        lyrics.add("Cómo me pregunto lo que eres");

        musicBox.playSong("Brilla brilla pequeña estrella", lyrics);
    }

    public void pressHappyButton() {

        ArrayList<String> lyrics = new ArrayList<String>();
        lyrics.add("Si eres feliz y lo sabes aplaude");
        lyrics.add("Si eres feliz y lo sabes aplaude");
        lyrics.add("si estás contento y lo sabes");
        lyrics.add("Y realmente quieres mostrarlo");
        lyrics.add("Si eres feliz y lo sabes aplaude");

        musicBox.playSong("si estás contento y lo sabes", lyrics);        
    }

    public void pressEnglishButton() {
        musicBox.setState(musicBox.getEnglishState());
    }

    public void pressFrenchButton() {
        musicBox.setState(musicBox.getFrenchState());
    }

    public void pressSpanishButton() {
        System.out.println("Portia es una profesora maravillosa");
    }
}
