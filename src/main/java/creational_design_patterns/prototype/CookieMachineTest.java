package creational_design_patterns.prototype;

public class CookieMachineTest {
    public static void main(String[] args) {
        Cookie prototype = new CoconutCookie();
        CookieMachine cookieMachine = new CookieMachine(prototype);
        Cookie bakedCookie = cookieMachine.makeCookie();
        System.out.println(bakedCookie.getDescription() + " hashCode: " + bakedCookie.hashCode());
        Cookie bakedCookie1 = cookieMachine.makeCookie();
        System.out.println(bakedCookie1.getDescription() + " hashCode: " + bakedCookie1.hashCode());
        System.out.println(bakedCookie == bakedCookie1); // false
        System.out.println(bakedCookie.getClass() == bakedCookie1.getClass()); // true
    }
}
