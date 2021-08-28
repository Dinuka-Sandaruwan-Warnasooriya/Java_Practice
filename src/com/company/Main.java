package com.company;

public class Main {

    public static void main(String[] args) {
        // class and  Objects
        Car c1= new Car();//object create
        Car c2 = new Car();

        //initialize the attribute
        c1.color = "Red";
        c1.name = "Toyota";
        c1.speed = 140;
        c1.weight = 45.5;
        c1.No = 100;

        //calling methods
        c1.speed();
        c1.color();

        c2.color();

    }
}
