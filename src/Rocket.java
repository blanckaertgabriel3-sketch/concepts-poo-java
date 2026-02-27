public class Rocket {
    String name;
    double weight;
    public Rocket(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }
    public String start() {
        return "Launch Rocket";
    }
    public String info() {
        return "name:" + name + "\n" + "weight:" + weight + "kg ";
    }
}
