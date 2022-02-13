import java.util.ArrayList;
/**
 * Class for exercises, having a title, muscles it works, and directions.
 * @author Jack Hyatt
 */
public class Exercise{
    private String title;
    private ArrayList<String> targetMuscles;
    private ArrayList<String> directions;

    /**
     * Constructor with just setting the title. Directions and target muscles are initialized
     * @param title: string for the title
     */
    public Exercise(String title){
        this.title = title;
        this.targetMuscles = new ArrayList<String>();
        this.directions = new ArrayList<String>();
    }

    /**
     * Constructor for all the attributes: title, directions, and muscles
     * @param title: string for the title
     * @param targetMuscles: arraylist of strings for the muscles
     * @param directions: arraylist of strings for the directions
     */
    public Exercise(String title, ArrayList<String> targetMuscles, ArrayList<String> directions){
        this.title = title;
        this.targetMuscles = targetMuscles;
        this.directions = directions;
    }

    /**
     * Method to add muscles to the list
     * @param muscle: string for the muscle to work
     */
    public void addTargetMuscle(String muscle){
        if(muscle!=null)
            targetMuscles.add(muscle);
    }

    /**
     * Method to remove a muscle from the list
     * @param muscle: string of the muscle
     */
    public void removeTargetMuscle(String muscle){
        targetMuscles.remove(muscle);
    }

    /**
     * Method to represent the object as a string
     */
    public String toString(){
        String output = "*** "+title+" ***\nMuscles: ";
        for(String i:targetMuscles)
            output += i + ", ";
        output = output.substring(0,output.length()-2) + "\nExercises:\n";
        for(String i:directions)
            output += "- " + i + "\n";
        return output+"\n";
    }
}