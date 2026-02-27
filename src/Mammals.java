public class Mammals extends Animal{
    public Mammals(String name) {
        super(name);
    }

    @Override
    public String move() {
        return name + " is moving";
    }
    public String walk() {
        return name + " is walking";
    }
}
