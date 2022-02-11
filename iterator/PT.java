import java.util.ArrayList;

public class PT{
    private String firstName;
    private String lastName;
    private String bio;
    private Exercise[] exercises;
    private int numExercises;

    public PT(String firstName,String lastName, String bio){
        this.firstName=firstName;
        this.lastName=lastName;
        this.bio=bio;
        exercises = new Exercise[2];
        numExercises = 0;
    }

    public void addExercise(String title, ArrayList<String> muscleGroups, ArrayList<String> directions){
        if(numExercises<exercises.length){
            exercises[numExercises] = new Exercise(title,muscleGroups,directions);
            numExercises++;
            return;
        }
        exercises = growArray(exercises);
        addExercise(title,muscleGroups,directions);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getBio() {
        return bio;
    }

    private Exercise[] growArray(Exercise[] exercises){
        Exercise[] newArr = new Exercise[exercises.length*2];
        for(int i = 0; i<exercises.length;i++){
            newArr[i] = exercises[i];
        }
        return newArr;
    }

    public ExerciseIterator createIterator(){
        return new ExerciseIterator(exercises);
    }

    @Override
    /**
     * 
     */
    public String toString(){
        return (firstName +" "+ lastName +"\n"+ bio +"\n");
    }
}