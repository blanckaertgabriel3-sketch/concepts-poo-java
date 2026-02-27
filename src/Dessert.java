public class Dessert extends Dish{
    double size;
    public Dessert(String name, double price, double size) {
        super(name, price);
        this.size = size;
    }

    @Override
    public double calculateFinalPrice() {
        return (price + (price * tva) + 15);
    }
}
