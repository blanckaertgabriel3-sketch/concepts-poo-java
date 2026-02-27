public class Birds extends Animal{
    public Birds(String name) {
        super(name);
    }

    @Override
    public String move() {
        return name + " is moving";
    }
    public String fly() {
        return name + " is flying";
    }
}
