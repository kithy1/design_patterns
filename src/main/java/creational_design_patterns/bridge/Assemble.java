package creational_design_patterns.bridge;

public class Assemble implements WorkShop{
    @Override
    public void work() {
        System.out.print(" And");
        System.out.println(" Assembled");
    }
}
