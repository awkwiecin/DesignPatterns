package Factory.Practice.Car.Ford;

import Factory.Practice.Car.Car;
import Factory.Practice.Car.SteeringWheelPosition;

public class Ford extends Car {
    public Ford(double engineCapacity, String fuelType, int productionYear, SteeringWheelPosition position) {
        super(engineCapacity, fuelType, productionYear, position);
    }
}
