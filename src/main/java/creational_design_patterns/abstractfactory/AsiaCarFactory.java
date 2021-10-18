package creational_design_patterns.abstractfactory;

public class AsiaCarFactory implements CarFactory{

    @Override
    public Car buildCar(CarType model) {
        Car car = null;
        switch (model) {
            case SMALL: car = new SmallCar(Location.ASIA);
            break;
            case SEDAN: car = new SedanCar(Location.ASIA);
            break;
            case LUXURY: car = new LuxuryCar(Location.ASIA);
            break;
            default: throw new UnsupportedOperationException();
        }
        return car;
    }
}
