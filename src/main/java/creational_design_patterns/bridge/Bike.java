package creational_design_patterns.bridge;

public class Bike extends Vehicle{

    public Bike(WorkShop workShop1, WorkShop workShop2) {
        super(workShop1, workShop2);
    }

    @Override
    protected void manufacture() {
        System.out.println("Bike ");
        workShop1.work();
        workShop2.work();
    }
}
