package creational_design_patterns.abstractfactory;

public class DefaultCarFactory implements CarFactory{

    @Override
    public Car buildCar(CarType model) {
        Car car = null;
        switch (model) {
            case SMALL: car = new SmallCar(Location.DEFAULT);
            break;
            case SEDAN: car = new SedanCar(Location.DEFAULT);
            break;
            case LUXURY: car = new LuxuryCar(Location.DEFAULT);
            break;
            default: throw new UnsupportedOperationException();
        }
        return car;
    }
}
