package com.company;

public class Tire {

    public enum SEASONTYP {SUMMER,WINTER}

    int breite;
    int zoll;
    int hight;
    SEASONTYP seasonType;
    Car car;



    public Tire(){


    }

    public Tire(int breite, int hight, int zoll,SEASONTYP seasonType) {

        this.breite = breite;
        this.zoll = zoll;
        this.hight = hight;
        this.seasonType = seasonType;
    }



    public int getBreite() {
        return breite;
    }

    public void setBreite(int breite) {
        this.breite = breite;
    }

    public int getZoll() {
        return zoll;
    }

    public void setZoll(int zoll) {
        this.zoll = zoll;
    }

    public int getHight() {
        return hight;
    }

    public void setHight(int hight) {
        this.hight = hight;
    }


    public SEASONTYP getSeasonType() {
        return seasonType;
    }

    public void setSeasonType(SEASONTYP seasonType) {
        this.seasonType = seasonType;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}
