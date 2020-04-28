package creational_design_patterns.singleton.basic_singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class BasicSingletonTest {
    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException, InstantiationException {
        BasicSingleton basicSingleton = BasicSingleton.INSTANCE;
        BasicSingleton basicSingleton1 = BasicSingleton.INSTANCE;
        System.out.println(basicSingleton == basicSingleton1); // true

        Class basicSingletonClass = basicSingleton.getClass();
        Constructor[] declaredConstructors = basicSingletonClass.getDeclaredConstructors();
        Constructor declaredConstructor = declaredConstructors[0];
        declaredConstructor.setAccessible(true);
        BasicSingleton reflectionBasicSingleton = (BasicSingleton) declaredConstructor.newInstance();
        System.out.println(basicSingleton == reflectionBasicSingleton); // false, we receive new instance of BasicSingleton
    }
}
