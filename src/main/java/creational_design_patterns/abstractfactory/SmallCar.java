package creational_design_patterns.abstractfactory;

public class SmallCar extends Car{

    public SmallCar(Location location) {
        super(CarType.SMALL, location);
        construct();
    }

    @Override
    protected void construct() {
        System.out.println("Building small car in " + this.location);
        // add accessories
    }
}
