package Factory.Practice.Car.BMW;

import Factory.Practice.Car.Car;
import Factory.Practice.Car.SteeringWheelPosition;

public class BMW extends Car {
    public BMW(double engineCapacity, String fuelType, int productionYear, SteeringWheelPosition position) {
        super(engineCapacity, fuelType, productionYear, position);
    }
}
