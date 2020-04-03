package Factory.Practice.Car.Ford;

import Factory.Practice.Car.Car;
import Factory.Practice.Car.SteeringWheelPosition;

public class CMax extends Car {

    public CMax(double engineCapacity, String fuelType, int productionYear, SteeringWheelPosition position) {
        super(engineCapacity, fuelType, productionYear, position);
    }
}
