package creational_design_patterns.abstractfactory;

public class SedanCar extends Car{

    public SedanCar(Location location) {
        super(CarType.SEDAN, location);
        construct();
    }

    @Override
    protected void construct() {
        System.out.println("Building sedan car in " + this.location);
        // add accessories
    }
}
