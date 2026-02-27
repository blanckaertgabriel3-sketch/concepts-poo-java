package Plane;

public abstract class Plane {
    String name;
    public Plane (String name) {
        this.name = name;
    }
    public abstract String fly();
    public String info() {
        return name;
    }
}
