public class Ariane6 extends Rocket{
    public Ariane6(String name, double weight) {
        super(name , weight);
    }
    public String stairs() {
        return "lose stairs";
    }
    public String start() {
        return "start launching";
    }
}
