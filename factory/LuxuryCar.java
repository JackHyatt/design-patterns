/**
 * Class to make the luxury cars. Extends Car
 * @author Jack Hyatt
 */
public class LuxuryCar extends Car{
    /**
     * Constructor to call the constructor of car
     * @param make string of the make of the car
     * @param model string of the model of the car
     */
    public LuxuryCar(String make, String model) {
        super(make, model);
    }
    
    /**
     * Method to add the frame to the car
     */
    protected void addFrame(){
        System.out.println("Adding a beautiful frame");
    }

    @Override
    /**
     * Method to add a special engine to the car, overriding the car method
     */
    protected void addEngine(){
        System.out.println("Adding a Supped Up Engine");
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
        accessories.add(Accessories.SPORTS_SEATS);
        accessories.add(Accessories.WINDOW_TINT);
        accessories.add(Accessories.HIGH_END_SOUND);
        accessories.add(Accessories.TRUNK_ORGANIZER);
        accessories.add(Accessories.BLUE_TOOTH);
    }
}