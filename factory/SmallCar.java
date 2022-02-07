/**
 * Class to make the small cars. Extends Car
 * @author Jack Hyatt
 */
public class SmallCar extends Car{
    /**
     * Constructor to call the constructor of car
     * @param make string of the make of the car
     * @param model string of the model of the car
     */
    public SmallCar(String make, String model) {
        super(make, model);
    }

    /**
     * Method to add the frame to the car
     */
    protected void addFrame(){
        System.out.println("Adding a small frame");
    }

    /**
     * Methdo to add certain accessories to the accessories arraylist
     */
    protected void addAccessories(){
        accessories.add(Accessories.FLOOR_MATTS);
        accessories.add(Accessories.PHONE_CHARGER);
    }
}