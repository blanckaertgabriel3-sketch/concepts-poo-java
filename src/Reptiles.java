public class Reptiles extends Animal{
    public Reptiles(String name) {
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
