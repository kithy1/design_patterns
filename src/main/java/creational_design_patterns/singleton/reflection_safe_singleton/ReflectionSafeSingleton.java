package creational_design_patterns.singleton.reflection_safe_singleton;

public class ReflectionSafeSingleton {
    public static final ReflectionSafeSingleton INSTANCE = new ReflectionSafeSingleton();

    private ReflectionSafeSingleton(){
        if (INSTANCE != null){
            throw new  IllegalStateException("Singleton already constructed");
        }
    }
}
