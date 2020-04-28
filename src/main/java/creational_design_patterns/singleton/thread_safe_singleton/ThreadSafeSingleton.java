package creational_design_patterns.singleton.thread_safe_singleton;

public class ThreadSafeSingleton {
    private static volatile ThreadSafeSingleton INSTANCE;

    private ThreadSafeSingleton(){}

    public static ThreadSafeSingleton getInstance(){
        if (INSTANCE == null){
            synchronized (ThreadSafeSingleton.class)
            {
                if (INSTANCE == null) {
                    INSTANCE = new ThreadSafeSingleton();
                }
            }
        }
        return INSTANCE;
    }
}
