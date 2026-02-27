import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //part1
        Mammals bear = new Mammals("bear");
        Birds cui = new Birds("cui");
        System.out.println(bear.move());
        System.out.println(bear.walk());
        System.out.println(cui.move());
        System.out.println(cui.fly());
        //part2
        System.out.println(" ");
        PrincipalDish steak = new PrincipalDish("steak", 45.99, "large");
        System.out.println(steak.info());
        System.out.println(steak.calculateFinalPrice());
        PrincipalDish cake = new PrincipalDish("cake", 25.99, "20");
        System.out.println(cake.info());
        System.out.println(cake.calculateFinalPrice());
        SpecialMenu spaghetti = new SpecialMenu("spaghetti", 800);
        System.out.println(spaghetti.info());
        System.out.println(spaghetti.calculateFinalPrice());

        ArrayList<Dish> dishes = new ArrayList<>();
        dishes.add(steak);
        dishes.add(cake);
        dishes.add(spaghetti);

        for(Dish d: dishes) {
            System.out.println(d.info());
        }
        //part3
        System.out.println(" ");
        Teachers teachers = new Teachers();
        Directors directors = new Directors();
        AdministrativeStaff administrativeStaff = new AdministrativeStaff();

        System.out.println(teachers.work());
        System.out.println(directors.work());
        System.out.println(administrativeStaff.work());
        //part4

        Circle circle = new Circle(2);
        System.out.println("Circle surface: " + circle.calculateSurface());

        Square square = new Square(2, 5);
        System.out.println("Square surface: " + square.calculateSurface());
        //part5
        System.out.println(" ");
        Tanker tanker1 = new Tanker("toto");
        Cargo cargo1 = new Cargo("lala");
        Cargo cargo2 = new Cargo("45twx");

        AircraftCarrier okogo = new AircraftCarrier();
        okogo.planesList.add(tanker1);
        okogo.planesList.add(cargo1);
        okogo.planesList.add(cargo2);

        System.out.println(okogo.printList());
        //part6
        System.out.println(" ");
        Ariane6 ariane6 = new Ariane6("ariane6", 87);
        Ariane6Start ariane6Start = new Ariane6Start(ariane6);
        System.out.println(ariane6Start.getInfo());
        System.out.println(ariane6Start.launch());

        System.out.println(" ");
        Ariane6 ariane8 = new Ariane6("ariane8", 8788);
        Ariane6Start ariane8Start = new Ariane6Start(ariane8);
        System.out.println(ariane8Start.getInfo());
        System.out.println(ariane8Start.launch());






    }
}