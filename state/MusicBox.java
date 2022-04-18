import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author Jack Hyatt
 */
public class MusicBox {
    private State englishState;
    private State frenchState;
    private State spanishState;
    private State state;

    /**
     * Constructor to initialize the states and default the state to english
     */
    public MusicBox() {
        englishState = new EnglishState(this);
        frenchState = new FrenchState(this);
        spanishState = new SpanishState(this);
        state = englishState;
    }

    public void pressStarButton() {
        state.pressStarButton();
    }

    public void pressHappyButton() {
        state.pressHappyButton();
    }

    public void pressEnglishButton() {
        state.pressEnglishButton();
    }

    public void pressFrenchButton() {
        state.pressFrenchButton();
    }

    public void pressSpanishButton() {
        state.pressSpanishButton();
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getEnglishState() {
        return this.englishState;
    }

    public State getFrenchState() {
        return this.frenchState;
    }

    public State getSpanishState() {
        return this.spanishState;
    }

    /**
     * Method to play a song with .8 second delay between each line
     * @param songName: The name of the song as a string
     * @param lyrics: THe lyrics of the song
     */
    public void playSong(String songName, ArrayList<String> lyrics) {
        System.out.println("Playing :" + songName);
        Iterator<String> itr = lyrics.iterator();
        while(itr.hasNext()){
            try {
                Thread.sleep(800);
            }catch(InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
            System.out.println(itr.next());
        }
    }
}