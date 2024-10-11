package com.sushant.springcore.DI;

import com.sushant.springcore.loosleycouple.PetrolEngine;

public class Testmain {
    public static void main(String[] args) {
        CarDI carDI = new CarDI(new PetrolEngine());
       // carDI.setEngine(new PetrolEngine());
        carDI.drive();
    }
}
