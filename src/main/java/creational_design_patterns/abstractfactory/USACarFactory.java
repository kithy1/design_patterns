package creational_design_patterns.abstractfactory;

public class USACarFactory implements CarFactory{

    @Override
    public Car buildCar(CarType model) {
        Car car = null;
        switch (model) {
            case SMALL: car = new SmallCar(Location.USA);
            break;
            case SEDAN: car = new SedanCar(Location.USA);
            break;
            case LUXURY: car = new LuxuryCar(Location.USA);
            break;
            default: throw new UnsupportedOperationException();
        }
        return car;
    }
}
