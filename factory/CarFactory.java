/**
 * Class to choose which kind of car to make
 * @author Jack Hyatt
 */
public class CarFactory{
    /**
     * Takes in what type of car, and makes that type of car
     * @param type string that is either small, sedan, or luxury
     * @param make string of the make of the car
     * @param model string of the model of the car
     * @throws IllegalArgumentException for when the type is not "small","sedan", or "luxury"
     * @return Car car, the car wanted to be made
     */
    public static Car createCar(String type, String make, String model){
        Car car;
        if(CarType.SMALL.toString().equalsIgnoreCase(type))
            car = new SmallCar(make,model);
        else if(CarType.SEDAN.toString().equalsIgnoreCase(type))
            car = new SedanCar(make,model);
        else if(CarType.LUXURY.toString().equalsIgnoreCase(type))
            car = new LuxuryCar(make, model);
        else
            throw new IllegalArgumentException();
        car.assemble();
        return car;
    }
}