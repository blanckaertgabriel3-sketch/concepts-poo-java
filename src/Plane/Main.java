package Plane;

import RocketLaunch.Ariane6;
import RocketLaunch.Ariane6Start;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
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

    }
}