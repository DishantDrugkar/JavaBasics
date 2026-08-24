package org.example.oops.inheritance;

public class SingleLevelInheritance {
    public static void main(String[] args) {
       Toyota toyota = new Toyota();
       toyota.color = "Black";
       toyota.fuelType = "Petrol";
       toyota.model = 2026;
       toyota.price = 450000.00;
       toyota.sunroof = true;
       toyota.display();

    }
}
class Car{
   int model;
   double price;
   String color;

   public void display(){
       System.out.println("Model : " + model);
       System.out.println("Price : " + price);
       System.out.println("Color : " + color);
   }
}

class Toyota extends Car{
     String fuelType;
     boolean sunroof;
}