package com.pluralsight;

import java.util.ArrayList;

public class VehicleApp {
    public static void main(String[] args) throws InterruptedException {

        Hovercraft samsHovercraft = new Hovercraft("red", 6, 100, 20, 0, true, true, 100);
        Car kadrianasCar = new Car("matte blue", 6, 100, 20, 4, 4, true);
        Moped nathansMoped = new Moped("matte black", 2, 100, 6, 2);
        Moped londonsMoped = new Moped("galaxy blue", 2, 100, 6, 2);

        ArrayList<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(londonsMoped);
        vehicles.add(samsHovercraft);
        vehicles.add(kadrianasCar);
        vehicles.add(nathansMoped);



        for (Vehicle v : vehicles) {
            if(v instanceof Moped) {
//                System.out.println(v.getColor());
                v.accelerate();
            }
        }
    }
}
