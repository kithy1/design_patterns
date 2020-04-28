package creational_design_patterns.singleton.static_factory_method_singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class StaticFactoryMethodSingletonTest {
    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException, InstantiationException {
        StaticFactoryMethodSingleton sfmSingleton = StaticFactoryMethodSingleton.getInstance();
        StaticFactoryMethodSingleton sfmSingleton1 = StaticFactoryMethodSingleton.getInstance();
        System.out.println(sfmSingleton == sfmSingleton1); // true


        Class sfmSingletonClass = sfmSingleton.getClass();
        Constructor[] declaredConstructors = sfmSingletonClass.getDeclaredConstructors();
        Constructor declaredConstructor = declaredConstructors[0];
        declaredConstructor.setAccessible(true);
        StaticFactoryMethodSingleton reflectionSfmSingleton = (StaticFactoryMethodSingleton) declaredConstructor.newInstance();
        System.out.println(sfmSingleton == reflectionSfmSingleton); // false

    }
}
