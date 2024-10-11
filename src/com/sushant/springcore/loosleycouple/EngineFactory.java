package com.sushant.springcore.loosleycouple;

public class EngineFactory {


   public IEngine getInstance(String engineName){
       if(engineName.equals("Petrol")){
           return new PetrolEngine();
       }
       else {
           return new DieselEngine();
       }
   }
}


