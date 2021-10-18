package creational_design_patterns.abstractfactory;

public abstract class Car {
    protected CarType model;
    protected Location location;

    public Car(CarType model, Location location) {
        this.model = model;
        this.location = location;
    }

    protected abstract void construct();

    @Override
    public String toString() {
        return "Car: " +
                ", model: " + model +
                ", build in: " + location;
    }
}
