package creational_design_patterns.prototype;

public class CookieMachine {
    private Cookie cookie;

    public CookieMachine(Cookie cookie){
        this.cookie = cookie;
    }
    public Cookie makeCookie(){
        return (Cookie) cookie.clone();
    }
}
