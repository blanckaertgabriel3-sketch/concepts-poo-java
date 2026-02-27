final public class SpecialMenu extends Dish {
    final double reduce = 0.1;
    public SpecialMenu(String name, double price) {
        super(name, price);
    }
    @Override
    public double calculateFinalPrice() {
        double finalPriceTva = (price + (price * tva));
        return (price - (finalPriceTva * reduce));
    }

}
