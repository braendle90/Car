package com.company;

public class Engine {

    public enum TYPE {DIESEL, Gas}


    private int horsepower;
    private TYPE typ;
    private Car car;


    public Engine(int horsepower, TYPE typ) {
        this.horsepower = horsepower;
        this.typ = typ;
    }


    public void drive(int speed) {


        System.out.printf("Im driving on: %d\n", speed);


        car.getFuelTank().changeTankContent();


    }


    public void cunsomption(int speed) {

        double consumtion100km = car.getFuelTank().getFuelConsumtion100km();


        if (speed < 1) {

            System.out.println("Sie Fahren zu langsam!!!");
        }
        if (speed > 1 && speed <= 40) {

            consumtion100km = consumtion100km * 0.5;

            System.out.println("Der Verbrauch liegt bei: " + consumtion100km);
        }
        if (speed > 40 && speed <= 80) {


            consumtion100km = consumtion100km * 0.8;

            System.out.println("Der Verbrauch liegt bei: " + consumtion100km);
        }
        if (speed > 81 && speed <= 120) {

            consumtion100km = consumtion100km * 1;

            System.out.println("Der Verbrauch liegt bei: " + consumtion100km);
        }
        if (speed > 120 && speed <= 140) {

            consumtion100km = consumtion100km * 1.25;

            System.out.println("Der Verbrauch liegt bei: " + consumtion100km);
        }
        if (speed > 120 && speed < 200) {

            consumtion100km = consumtion100km * 1.50;

            System.out.println("Der Verbrauch liegt bei: " + consumtion100km);
        } else
            System.out.println("To high!!!");


    }


    public int getHorsepower() {
        return horsepower;
    }

    public TYPE getTyp() {
        return typ;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}
