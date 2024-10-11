package com.sushant.springcore.DI;

import com.sushant.springcore.loosleycouple.IEngine;

public class CarDI {

    IEngine engine;

//    public void setEngine(IEngine engine) {
//        this.engine = engine;
//    }


    public CarDI(IEngine engine) {
        this.engine = engine;
    }

    public  void drive() {
        int start = engine.start();


        if (start >= 1) {
            System.out.println("Engine Started....");
        } else {
            System.out.println("Engine not Started ...");
        }


    }
}
