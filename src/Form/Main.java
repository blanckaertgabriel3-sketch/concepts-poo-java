package Form;

import ZOO.Birds;
import ZOO.Mammals;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //part4

        Circle circle = new Circle(2);
        System.out.println("Form.Circle surface: " + circle.calculateSurface());

        Square square = new Square(2, 5);
        System.out.println("Form.Square surface: " + square.calculateSurface());


    }
}