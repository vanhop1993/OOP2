package com.example.oop2;

public class Dog extends Animal {
    String backgroudColor;
    String speed;

    public void setSpeed(Integer speed){
        this.speed = speed + "km/h";
    }
}
