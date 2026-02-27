package Dish;

import Employe.AdministrativeStaff;
import Employe.Directors;
import Employe.Teachers;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
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
    }
}