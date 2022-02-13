import java.util.ArrayList;

/**
 * Class for a person's info and their exercises
 * @author Jack Hyatt
 */
public class PT{
    private String firstName;
    private String lastName;
    private String bio;
    private Exercise[] exercises;
    private int numExercises;

    /**
     * Constructor to set the name and bio. Initialized the exercise array to 2, and the num of exercises to 0.
     * @param firstName: string of the first name
     * @param lastName: string of the last name
     * @param bio: string of the person's bio
     */
    public PT(String firstName,String lastName, String bio){
        this.firstName=firstName;
        this.lastName=lastName;
        this.bio=bio;
        exercises = new Exercise[2];
        numExercises = 0;
    }

    /**
     * Method to add an exercise to the exercise array
     * @param title: string of the title for exercise
     * @param muscleGroups: arraylist of strings for the muscle groups
     * @param directions: arraylist of strings for the directions
     */
    public void addExercise(String title, ArrayList<String> muscleGroups, ArrayList<String> directions){
        if(numExercises<exercises.length){
            exercises[numExercises] = new Exercise(title,muscleGroups,directions);
            numExercises++;
            return;
        }
        exercises = growArray(exercises);
        addExercise(title,muscleGroups,directions);
    }

    /**
     * Method to get the firstname string
     * @return the first name string
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Method to get the lastname string
     * @return the last name string
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Method to get the bio string
     * @return the bio string
     */
    public String getBio() {
        return bio;
    }

    /**
     * Method to double the size of the exercise array when needed
     * @param exercises: array of exercises
     * @return the same exercise array but with twice the size
     */
    private Exercise[] growArray(Exercise[] exercises){
        Exercise[] newArr = new Exercise[exercises.length*2];
        for(int i = 0; i<exercises.length;i++){
            newArr[i] = exercises[i];
        }
        return newArr;
    }

    /**
     * Method to create an exercise iterator
     * @return a new exercise iterator
     */
    public ExerciseIterator createIterator(){
        return new ExerciseIterator(exercises);
    }

    @Override
    /**
     * Method to represent the object as a string
     */
    public String toString(){
        return (firstName +" "+ lastName +"\n"+ bio +"\n");
    }
}