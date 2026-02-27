package RocketLaunch;

public class Ariane6Start {
    Ariane6 rocket;
    public Ariane6Start(Ariane6 rocket) {
        this.rocket = rocket;
    }
    public String getInfo() {
        return rocket.info();
    }
    public String launch() {
        return rocket.name + " " + rocket.start() + "\n" + rocket.name + " " + rocket.stairs();
    }
}
