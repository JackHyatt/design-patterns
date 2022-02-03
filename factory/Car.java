import java.util.ArrayList;

/**
 * 
 * @author Jack Hyatt
 */
public class Car{
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
    }

    public void assemble(){

    }

    protected void addFrame(){

    }

    protected void addWheels(){

    }

    protected void addEngine(){

    }

    protected void addWindows(){

    }

    protected void addAccessories(){

    }

    protected void displayAccessories(){

    }
}