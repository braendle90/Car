package com.company;

public class Mirror {

    public enum POSITION {LEFT,MIDDLE,RIGHT};
    private int posX;
    private int posYx;
    POSITION positon;
    Car car;



    public Mirror(POSITION positon) {
        this.positon = positon;
    }


    public Mirror(int posX, int posYx, POSITION positon) {
        this.posX = posX;
        this.posYx = posYx;
        this.positon = positon;
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosYx() {
        return posYx;
    }

    public void setPosYx(int posYx) {
        this.posYx = posYx;
    }

    public POSITION getPositon() {
        return positon;
    }

    public void setPositon(POSITION positon) {
        this.positon = positon;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}
