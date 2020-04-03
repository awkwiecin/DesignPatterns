package Factory.Practice.Car.BMW;

import Factory.Practice.Car.Car;
import Factory.Practice.Car.SteeringWheelPosition;

public class X5 extends Car {

    public X5(double engineCapacity, String fuelType, int productionYear, SteeringWheelPosition position) {
        super(engineCapacity, fuelType, productionYear, position);
    }
}
