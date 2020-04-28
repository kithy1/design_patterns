package creational_design_patterns.singleton.serializable_safe_singleton;

import java.io.Serializable;

public class SerializableSingleton implements Serializable{
    private static SerializableSingleton INSTANCE;
    public  int i;

    private SerializableSingleton(){
    }

    public static SerializableSingleton getInstance(){
        if (INSTANCE == null) {
            INSTANCE = new SerializableSingleton();
        }
        return INSTANCE;
    }


    private Object readResolve(){ // is used for replacing the object read from the stream.
                                  // it allow enforcing singletons; when an object is read, replace it with the singleton instance.
        return getInstance();
    }
}
