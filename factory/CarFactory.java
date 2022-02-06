public class CarFactory{
    public static Car createCar(String type, String make, String model){
        Car car;
        if(type.equalsIgnoreCase("small"))
            car = new SmallCar(make,model);
        else if(type.equalsIgnoreCase("sedan"))
            car = new SedanCar(make,model);
        else if(type.equalsIgnoreCase("luxury"))
            car = new LuxuryCar(make, model);
        else
            throw new IllegalArgumentException();
        car.assemble();
        return car;
    }
}