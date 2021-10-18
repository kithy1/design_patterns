package creational_design_patterns.abstractfactory;

public class LuxuryCar extends Car{


    public LuxuryCar(Location location) {
        super(CarType.LUXURY, location);
        construct();
    }

    @Override
    protected void construct() {
        System.out.println("Building luxury car in " + this.location);
        // add accessories
    }
}
