import java.util.HashMap;

/**
 * Displays and holds the Percentage of a hashmap of a presidential race
 * @author Jack Hyatt
 */
public class PercentageDisplay implements Observer{
    private Subject poll;
    private HashMap<String,Integer> votes;
    private int numVotes;

    /**
     * Contructor for class. Initializes votes hashmap, numVotes int, poll Subject. 
     * This instance of the class will be put into the poll's obsever list.
     * @param poll the poll that's for the presidential race. 
     */
    public PercentageDisplay(Subject poll){
        this.poll = poll;
        poll.registerObserver(this);
        this.votes = new HashMap<String,Integer>();
        this.numVotes = 0;
    }

    /**
     * Updates the hashmap of votes, the number of votes, and then calls display()
     * @param votes: Hashmap of president with their votes
     */
    public void update(HashMap<String,Integer> votes){
        this.votes = votes;
        numVotes = 0;
        for(Integer i:votes.values()){
            numVotes += i.intValue();
        }
        display();
    }

    /**
     * Displays the votes for each candidate in a percentage
     */
    private void display(){
        System.out.println("Current Precentage of Votes:");
        for(String i:votes.keySet()){
            System.out.printf(i + ": %.1f%%%n", 100.0*Integer.valueOf(votes.get(i))/numVotes);
        }
    }
}
