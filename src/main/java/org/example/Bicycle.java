package org.example;


public class Bicycle {
    protected int gear;
    protected int speed;

    public Bicycle(int startSpeed, int startGear){
        gear=startGear;
        speed=startSpeed;

    }
    public void setGear(int newValue){
        gear = newValue;
    }
    public void applyBrake(int increment){
        speed+= increment;
    }
    public void speedUp(int decrement){
        speed -= decrement;
    }
}
