package creational_design_patterns.bridge;

public abstract class Vehicle {

    protected WorkShop workShop1;
    protected WorkShop workShop2;

    public Vehicle(WorkShop workShop1, WorkShop workShop2) {
        this.workShop1 = workShop1;
        this.workShop2 = workShop2;
    }

    protected abstract void manufacture();
}
