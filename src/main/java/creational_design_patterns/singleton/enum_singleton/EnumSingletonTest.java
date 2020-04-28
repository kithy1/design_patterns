package creational_design_patterns.singleton.enum_singleton;

public class EnumSingletonTest {
    public static void main(String[] args) {
        EnumSingleton enumSingleton = EnumSingleton.INSTANCE;
        EnumSingleton enumSingleton1 = EnumSingleton.INSTANCE;
        System.out.println(enumSingleton == enumSingleton1); // true , reflection safe, serialization safe
    }

}
