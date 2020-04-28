package creational_design_patterns.singleton.lazy_loading_singleton;

public class LazyLoadingSingleton {
    private static LazyLoadingSingleton INSTANCE;

    private LazyLoadingSingleton(){}

    public static LazyLoadingSingleton getInstance(){
        if (INSTANCE == null) {
            INSTANCE = new LazyLoadingSingleton(); // instance is created when the method getInstance() is called
        }
        return INSTANCE;
    }

}
