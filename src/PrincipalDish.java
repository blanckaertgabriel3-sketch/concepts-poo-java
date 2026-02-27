public class PrincipalDish extends Dish{
    String size;
    public PrincipalDish(String name, double price, String size) {
        super(name, price);
        this.size = size;
    }

    @Override
    public double calculateFinalPrice() {
        return (price + (price * tva));
    }
}
