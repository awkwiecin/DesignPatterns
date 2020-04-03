package Factory.Practice.Car;


import Factory.Practice.Car.BMW.BMW;
import Factory.Practice.Car.BMW.BMWType;
import Factory.Practice.Car.Ford.Ford;
import Factory.Practice.Car.Ford.FordType;

public class ContinentalFactory extends Factory {


    SteeringWheelPosition position = SteeringWheelPosition.CONTINENTAL;


    @Override
    public Car createBMWModel(BMWType type) {
        switch (type) {
            case X5:
                return new BMW(1.8, "Petrol", 2019,position);
            case E60:
                return new BMW(2.0, "Diesel", 2018,position);
            default:
                throw new UnsupportedOperationException("Nieznany typ");
        }


    }

    @Override
    public Car createFordModel(FordType type) {
        switch (type) {
            case CMax:
                return new Ford(1.8, "Petrol", 2019,position);
            case Focus:
                return new Ford(2.0, "Diesel", 2018,position);
            default:
                throw new UnsupportedOperationException("Nieznany typ");
        }
    }
}
