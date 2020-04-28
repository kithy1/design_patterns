package creational_design_patterns.singleton.static_factory_method_singleton;

public class StaticFactoryMethodSingleton {
    private static final StaticFactoryMethodSingleton INSTANCE = new StaticFactoryMethodSingleton();

    private StaticFactoryMethodSingleton(){}

    public static StaticFactoryMethodSingleton getInstance(){
        return INSTANCE;
    }
}
