import java.util.ArrayList;
/**
 * 
 * @author Jack Hyatt
 */
public class Exercise{
    private String title;
    private ArrayList<String> targetMuscles;
    private ArrayList<String> directions;

    public Exercise(String title){
        this.title = title;
        this.targetMuscles = new ArrayList<String>();
        this.directions = new ArrayList<String>();
    }

    public Exercise(String title, ArrayList<String> targetMuscles, ArrayList<String> directions){
        this.title = title;
        this.targetMuscles = targetMuscles;
        this.directions = directions;
    }

    public void addTargetMuscle(String muscle){
        if(muscle!=null)
            targetMuscles.add(muscle);
    }

    public void removeTargetMuscle(String muscle){
        targetMuscles.remove(muscle);
    }

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