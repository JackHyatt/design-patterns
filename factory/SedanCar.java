/**
 * Class to make the Sedan cars. Extends Car
 * @author Jack Hyatt
 */
public class SedanCar extends Car{
    /**
     * Constructor to call the car constructor
     * @param make string of the make of the car
     * @param model string of the model of the car
     */
    public SedanCar(String make, String model) {
        super(make, model);
    }
    
    /**
     * Method to add the frame to the car
     */
    protected void addFrame(){
        System.out.println("Adding a three part frame");
    }

    /**
     * Method to add certain accessories to the accessories arraylist
     */
    protected void addAccessories(){
        accessories.add(Accessories.FLOOR_MATTS);
        accessories.add(Accessories.PHONE_CHARGER);
        accessories.add(Accessories.BACK_UP_CAMERA);
        accessories.add(Accessories.EXTRA_CUP_HOLDERS);
        accessories.add(Accessories.HEATED_SEATS);
    }
}