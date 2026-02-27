package RocketLaunch;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //part6
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