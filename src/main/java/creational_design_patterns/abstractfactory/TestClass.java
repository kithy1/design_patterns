package creational_design_patterns.abstractfactory;

import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

public class TestClass {

    public static void main(String[] args) {
        Map<String, CarFactory> factoryTypes = Map.of("ASIA", new AsiaCarFactory(), "DEFAULT", new DefaultCarFactory(), "USA", new USACarFactory());

        AtomicReference<CarFactory> abstractFactory = new AtomicReference<>();

        factoryTypes.forEach((s, carFactory) -> {
            System.out.println("car factory location: " + s);
            abstractFactory.set(carFactory);
            abstractFactory.get().buildCar(CarType.SMALL);
            abstractFactory.get().buildCar(CarType.SEDAN);
            abstractFactory.get().buildCar(CarType.LUXURY);
        });
    }
}
