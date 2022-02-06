import java.util.ArrayList;

/**
 * 
 * @author Jack Hyatt
 */
public abstract class Car{
    private String make;
    private String model;
    protected ArrayList<Accessories> accessories;
    
    /**
     * 
     * @param make: string for the make of the car
     * @param model: string for the model of the car
     */
    public Car(String make, String model){
        this.make = make;
        this.model = model;
        this.accessories = new ArrayList<Accessories>();
    }

    public void assemble(){
        System.out.println("Creating a " + make + " " + model);
        addFrame();
        addWheels();
        addEngine();
        addWindows();
        addAccessories();
        displayAccessories();
    }

    protected abstract void addFrame();

    protected void addWheels(){
        System.out.println("Adding the Wheels");
    }

    protected void addEngine(){
        System.out.println("Adding a Standard Engine");
    }

    protected void addWindows(){
        System.out.println("Adding Windows");
    }

    protected abstract void addAccessories();

    protected void displayAccessories(){
        System.out.println("Accessories:");
        for(Accessories i : accessories){
            System.out.println("- " + i);
        }
    }
}