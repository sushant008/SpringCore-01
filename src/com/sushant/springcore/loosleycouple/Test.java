package com.sushant.springcore.loosleycouple;

public class Test {
    public static void main(String[] args) {


        EngineFactory engineFactory = new EngineFactory();
        //engineFactory.getInstance("Petrol");

        Car car = new Car(engineFactory.getInstance("Petrol"));

        car.drive();
    }
}
