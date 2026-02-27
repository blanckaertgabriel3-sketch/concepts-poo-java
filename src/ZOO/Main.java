package ZOO;

import RocketLaunch.Ariane6;
import RocketLaunch.Ariane6Start;

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


    }
}