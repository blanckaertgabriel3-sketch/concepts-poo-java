package Form;

public class Circle extends Forme {
    double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    @Override
    public double calculateSurface() {
        return ( Math.PI * ( radius*radius ) );
    }
}
