package com.company.util;

import com.company.*;

import java.util.List;


public class CreateVehicleHelper {


    public static void carCreation(Car c, Engine e, FuelTank f, List<Mirror> m, Tire t) {

        c.setEngine(e);
        e.setCar(c);
        c.setFuelTank(f);
        c.setMirror(m);
        c.setTire(t);



    }

    public static void bootCreation(Car c, Engine e) {

        c.setEngine(e);
        e.setCar(c);


    }


}
