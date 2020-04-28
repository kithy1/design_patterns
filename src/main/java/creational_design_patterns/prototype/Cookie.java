package creational_design_patterns.prototype;

public class Cookie implements Cloneable {
    private String description;

    public String getDescription() {
        return description;
    }

    public Cookie(String description) {
        this.description = description;
    }

    @Override
    public Object clone(){
        try{
            Cookie copy = (Cookie) super.clone();
            return copy;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}
