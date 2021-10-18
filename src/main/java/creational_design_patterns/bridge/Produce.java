package creational_design_patterns.bridge;

public class Produce implements WorkShop{
    @Override
    public void work() {
        System.out.print("Produced");
    }
}
