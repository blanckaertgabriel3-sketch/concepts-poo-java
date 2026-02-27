package Plane;

public class Cargo extends Plane {
    public Cargo (String name) {
        super(name);
    }
    @Override
    public String fly() {
        return "The military plane is here";
    }
}
