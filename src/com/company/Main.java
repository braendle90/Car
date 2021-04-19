package com.company;

import com.company.service.Calculation;
import com.company.service.CalulationImpl;
import com.company.util.CreateVehicleHelper;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {



        Engine engine = new Engine(190, Engine.TYPE.DIESEL);

        Car audiA6 = new Car(engine,"Audi","2020",20000);

        FuelTank f1 = new FuelTank(60,20,5);

        Tire fl = new Tire(255,35,20, Tire.SEASONTYP.SUMMER );
        Tire fr = new Tire(255,35,20, Tire.SEASONTYP.SUMMER );
        Tire hl = new Tire(275,30,20, Tire.SEASONTYP.SUMMER );
        Tire hr = new Tire(275,30,20, Tire.SEASONTYP.SUMMER );


        List<Mirror> mirrorList = new ArrayList<>();

        Mirror ml1 = new Mirror(10,20,Mirror.POSITION.LEFT);
        Mirror m1 = new Mirror(10,20,Mirror.POSITION.MIDDLE);
        Mirror mr1 = new Mirror(10,60,Mirror.POSITION.RIGHT);

        mirrorList.add(ml1);
        mirrorList.add(m1);
        mirrorList.add(mr1);




        CreateVehicleHelper.carCreation(audiA6,engine,f1,mirrorList,fl);


        System.out.println(audiA6.getMirror().get(0).getPositon());
        System.out.println(audiA6.getMirror().get(1).getPositon());
        System.out.println(audiA6.getMirror().get(2).getPositon());



        System.out.println("______------------_____");


        System.out.println(audiA6.getFuelTank().getTankContent());
        System.out.println(audiA6.getFuelTank().getTankSize());

        System.out.println(audiA6.getFuelTank().getTankContent());


        audiA6.getFuelTank().setFuelConsumtion100km(5);



        audiA6.getRemainingRange();


        audiA6.getEngine().cunsomption(100);

        audiA6.turboBoost();
        audiA6.getRemainingRange();


        audiA6.getFuelTank().changeTankContent();









    }
}
