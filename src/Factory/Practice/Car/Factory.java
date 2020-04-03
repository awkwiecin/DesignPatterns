package Factory.Practice.Car;

import Factory.Practice.Car.BMW.BMWType;
import Factory.Practice.Car.Ford.FordType;

public abstract class Factory {

    abstract public Car createBMWModel(BMWType type);
    abstract public Car createFordModel(FordType type);


}
