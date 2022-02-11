import java.util.Iterator;

/**
 * 
 * @author Jack Hyatt
 */
public class ExerciseIterator implements Iterator<Exercise>{
    private Exercise[] exercises;
    private int position;

    public ExerciseIterator(Exercise[] exercises){
        this.exercises = exercises;
    }

    public boolean hasNext(){
        return (position < exercises.length && exercises[position]!=null);
    }

    public Exercise next(){
        if(!hasNext())
            return null;
        position++;
        return exercises[position-1];
    }
}