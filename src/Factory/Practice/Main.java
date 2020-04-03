package Factory.Practice;

import Factory.Practice.Car.BMW.BMWType;
import Factory.Practice.Car.Car;
import Factory.Practice.Car.CommonwealthFactory;
import Factory.Practice.Car.ContinentalFactory;
import Factory.Practice.Car.Factory;
import Factory.Practice.Car.Ford.FordType;

public class Main {

    public static void main(String[]args){

         Factory commonwealthFactory = new CommonwealthFactory();
         Factory continentalFactory = new ContinentalFactory();
         Car bmw = commonwealthFactory.createBMWModel(BMWType.E60);
         System.out.println("BMW");
         System.out.println(bmw.getSteeringWheelPosition());

         Car ford = continentalFactory.createFordModel(FordType.CMax);
         System.out.println("Ford");
         System.out.println(ford.getSteeringWheelPosition());
}
}
