package com.sushant.springcore.loosleycouple;

public class Car {


     //public  EngineFactory engineFactory;

    IEngine engine;

    public Car(IEngine engine) {
        this.engine = engine;
    }

    public  void drive(){
         int start = engine.start();


         if(start >=1){
             System.out.println("Engine Started....");
         }

         else{
             System.out.println("Engine not Started ...");
         }
     }
}
