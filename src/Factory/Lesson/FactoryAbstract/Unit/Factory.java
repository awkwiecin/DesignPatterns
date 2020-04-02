package Factory.Lesson.FactoryAbstract.Unit;

public abstract class Factory {
    abstract public InfantryUnit createInfantryUnit(UnitType type);
    abstract public MechanizedUnit createMechanizedUnit(UnitType type);
    abstract public AirUnit createAirUnit(UnitType type);
}
