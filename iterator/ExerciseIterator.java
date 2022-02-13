import java.util.Iterator;

/**
 * Class to iterate over a list of exercises
 * @author Jack Hyatt
 */
public class ExerciseIterator implements Iterator<Exercise>{
    private Exercise[] exercises;
    private int position;

    /**
     * Constructor that sets the list of exercises
     * @param exercises: array of exercises
     */
    public ExerciseIterator(Exercise[] exercises){
        this.exercises = exercises;
    }

    /**
     * Method to check if there is more left in the exercise array to iterate over and return true or false
     */
    public boolean hasNext(){
        return (position < exercises.length && exercises[position]!=null);
    }

    /**
     * Method to return the current exercise in the array, then move to the next one
     */
    public Exercise next(){
        if(!hasNext())
            return null;
        position++;
        return exercises[position-1];
    }
}