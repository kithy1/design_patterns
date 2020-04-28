package creational_design_patterns.singleton.static_inner_class_singleton;

public class StaticHolderSingleton {

    private StaticHolderSingleton() {
        if (Holder.INSTANCE != null) {
            throw new IllegalStateException("Singleton already constructed");
        }
    }

    public static StaticHolderSingleton getInstance() {
        return Holder.INSTANCE;
    }

    private static class Holder {
        private static final StaticHolderSingleton INSTANCE = new StaticHolderSingleton();
    }
}
