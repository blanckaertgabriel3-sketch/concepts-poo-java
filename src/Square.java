public class Square extends Forme{
    double width;
    double height;
    public Square(double width, double height) {
        this.width = width;
        this.height = height;
    }
    @Override
    public double calculateSurface() {
        return (width * height);
    }
}
