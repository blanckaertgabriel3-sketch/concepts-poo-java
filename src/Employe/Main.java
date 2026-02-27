package Employe;

import Plane.AircraftCarrier;
import Plane.Cargo;
import Plane.Tanker;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //part3
        System.out.println(" ");
        Teachers teachers = new Teachers();
        Directors directors = new Directors();
        AdministrativeStaff administrativeStaff = new AdministrativeStaff();

        System.out.println(teachers.work());
        System.out.println(directors.work());
        System.out.println(administrativeStaff.work());
    }
}