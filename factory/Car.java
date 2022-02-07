import java.util.ArrayList;

/**
 * Abstract class car that holds make and model and accessories. Will assemble the car.
 * @author Jack Hyatt
 */
public abstract class Car{
    private String make;
    private String model;
    protected ArrayList<Accessories> accessories;
    
    /**
     * Constructor to set the make and model, and to intialize the accesories arraylist
     * @param make: string for the make of the car
     * @param model: string for the model of the car
     */
    public Car(String make, String model){
        this.make = make;
        this.model = model;
        this.accessories = new ArrayList<Accessories>();
    }

    /**
     * Method to call the other methods to make the call
     */
    public void assemble(){
        System.out.println("Creating a " + make + " " + model);
        addFrame();
        addWheels();
        addEngine();
        addWindows();
        addAccessories();
        displayAccessories();
    }

    /**
     * Abstract method for adding the frame
     */
    protected abstract void addFrame();

    /**
     * Method to add wheels
     */
    protected void addWheels(){
        System.out.println("Adding the Wheels");
    }

    /**
     * Method to add engine
     */
    protected void addEngine(){
        System.out.println("Adding a Standard Engine");
    }

    /**
     * Method to add windows
     */
    protected void addWindows(){
        System.out.println("Adding Windows");
    }

    /**
     * abstract method to add accessories
     */
    protected abstract void addAccessories();

    /**
     * method to display the accessories
     */
    protected void displayAccessories(){
        System.out.println("Accessories:");
        for(Accessories i : accessories){
            System.out.println("- " + i);
        }
    }
}