package com.company;

import java.util.List;

public class Car {


    private String brand;
    private String constructionYear;
    private Engine engine;
    private FuelTank fuelTank;
    private List<Mirror> mirror;
    private Tire tire;



    private double price;
    private int doors;
    private boolean hasTrailerHitch;
    private int ServiceInDays;

    private int speed;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public Car() {


    }

    public Car(Engine engine, String brand, String constructionYear, double price) {

        this.engine = engine;
        this.brand = brand;
        this.constructionYear = constructionYear;
        this.price = price;
        this.fuelTank = new FuelTank();


    }

    public Car(Engine engine, String brand, String constructionYear, int horsePower, double price, int doors, boolean hasTrailerHitch, int serviceInDays) {
        this.brand = brand;
        this.constructionYear = constructionYear;
        this.engine = engine;
        this.price = price;
        this.doors = doors;
        this.hasTrailerHitch = hasTrailerHitch;
        this.ServiceInDays = serviceInDays;

    }


    public void getRemainingRange() {


        System.out.println("Full Consumption: "+this.getFuelTank().getFuelConsumtion100km());
        System.out.println("Full Content: "+this.getFuelTank().getTankContent());


        System.out.printf("Restreichweite: ");


    }


    public void motorStart() {

        System.out.println("Motor is starting!!!");

    }

    public void turboBoost() {

        //calculat the tankcontent to the max content in %.


        double tankContentInPercent = (this.getFuelTank().getTankContent() * 100) / this.getFuelTank().getTankSize();

        System.out.println("Tankinhalt in %: " + tankContentInPercent);


        if (tankContentInPercent > 10) {

            System.out.println("SuperBoostMode");
        } else {
            System.out.println("Not enough fuel to go to Superboost");

        }

    }

    public double refuelTank() {

        System.out.println("Bitte gehen Sie Tanken.");


        return 0;


    }

    public void honk(int times) {

        for (int i = 0; i < times; i++) {

            System.out.println("Tuuut");

        }
    }


    // Start with getter and setter


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getConstructionYear() {
        return constructionYear;
    }

    public void setConstructionYear(String constructionYear) {
        constructionYear = constructionYear;
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public boolean isHasTrailerHitch() {
        return hasTrailerHitch;
    }

    public void setHasTrailerHitch(boolean hasTrailerHitch) {
        this.hasTrailerHitch = hasTrailerHitch;
    }

    public int getServiceInDays() {
        return ServiceInDays;
    }

    public void setServiceInDays(int serviceInDays) {
        ServiceInDays = serviceInDays;
    }


    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }


    public FuelTank getFuelTank() {
        return fuelTank;
    }

    public void setFuelTank(FuelTank fuelTank) {
        this.fuelTank = fuelTank;
    }

    public List<Mirror> getMirror() {
        return mirror;
    }

    public void setMirror(List<Mirror> mirror) {
        this.mirror = mirror;
    }

    public Tire getTire() {
        return tire;
    }

    public void setTire(Tire tire) {
        this.tire = tire;
    }
}
