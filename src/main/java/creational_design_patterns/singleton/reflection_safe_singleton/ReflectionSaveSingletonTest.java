package creational_design_patterns.singleton.reflection_safe_singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectionSaveSingletonTest {
    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException, InstantiationException {
        ReflectionSafeSingleton reflectionSafeSingleton = ReflectionSafeSingleton.INSTANCE;
        ReflectionSafeSingleton reflectionSafeSingleton1 = ReflectionSafeSingleton.INSTANCE;
        System.out.println(reflectionSafeSingleton == reflectionSafeSingleton1); //true

        Class singletonClass = reflectionSafeSingleton.getClass();
        Constructor[] instance = singletonClass.getDeclaredConstructors();
        Constructor constructor = instance[0];
        constructor.setAccessible(true);
        ReflectionSafeSingleton reflectionReflectionSafeSingleton = (ReflectionSafeSingleton) constructor.newInstance(); // IllegalStateException: Singleton already constructed


    }
}
