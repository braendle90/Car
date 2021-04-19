package com.company;

public class FuelTank {


    private int tankSize;
    private int tankContent;
    private int fuelConsumtion100km;
    Car car;

    public FuelTank(){

    }


    public FuelTank(int tankSize, int tankContent, int fuelConsumtion100km) {
        this.tankSize = tankSize;
        this.tankContent = tankContent;
        this.fuelConsumtion100km = fuelConsumtion100km;
    }

    public void changeTankContent(){

        this.tankContent= this.tankContent - this.fuelConsumtion100km;



        System.out.println("sezte neuer Tankinhalt: "+ this.getTankContent());
    }

    public int getTankSize() {
        return tankSize;
    }


    public int getTankContent() {
        return tankContent;
    }

    public void setTankContent(int tankContent) {
        this.tankContent = tankContent;
    }

    public int getFuelConsumtion100km() {
        return fuelConsumtion100km;
    }

    public void setFuelConsumtion100km(int fuelConsumtion100km) {
        this.fuelConsumtion100km = fuelConsumtion100km;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}
