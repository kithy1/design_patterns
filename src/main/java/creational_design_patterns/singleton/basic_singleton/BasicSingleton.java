package creational_design_patterns.singleton.basic_singleton;

public class BasicSingleton {
    public static final BasicSingleton INSTANCE = new BasicSingleton();

    private BasicSingleton(){}
}
