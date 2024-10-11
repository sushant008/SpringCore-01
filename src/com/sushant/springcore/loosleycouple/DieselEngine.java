package com.sushant.springcore.loosleycouple;

public class DieselEngine implements IEngine{

    @Override
    public int start() {

        System.out.println("Diesle Engine Started ....");
        return 1;
    }
}
