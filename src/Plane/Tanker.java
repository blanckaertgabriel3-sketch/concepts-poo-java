package Plane;

public class Tanker extends Plane {
    public Tanker(String name) {
        super(name);
    }
    @Override
    public String fly() {
        return "Plane.Tanker is flying";
    }
}
