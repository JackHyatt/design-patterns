import java.util.HashMap;

/**
 * Class that will display the votes for a presidential candidate in a race.
 * @author Jack Hyatt
 */
public class TallyDisplay implements Observer{
    private Subject poll;
    private HashMap<String,Integer> votes;

    /**
     * Contructor for class. Initializes votes hashmap, poll Subject. 
     * This instance of the class will be put into the poll's obsever list.
     * @param poll the poll that's for the presidential race. 
     */
    public TallyDisplay(Subject poll){
        this.poll = poll;
        poll.registerObserver(this);
        this.votes = new HashMap<String,Integer>();
    }

    /**
     * Updates the votes hashmap and calls display()
     */
    public void update(HashMap<String,Integer> votes){
        this.votes = votes;
        display();
    }

    /**
     * Displays the number of votes for each candidate
     */
    private void display(){
        System.out.println("Current Tallies:");
        for(String i:votes.keySet()){
            System.out.println(i +": "+votes.get(i));
        }
    }
}
