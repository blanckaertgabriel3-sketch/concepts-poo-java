package Dish;

public abstract class Dish {
    String name;
    double price;
    final double tva = 0.2;
    public Dish(String name, double price) {
        this.name = name;
        this.price = price;
    }
    public abstract double calculateFinalPrice();

    public String info() {
        return name + " " + price;
    }
}
