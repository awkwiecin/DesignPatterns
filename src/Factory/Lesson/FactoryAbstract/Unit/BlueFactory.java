package Factory.Lesson.FactoryAbstract.Unit;

public class BlueFactory extends Factory {
    @Override
    public InfantryUnit createInfantryUnit(UnitType type) {
        switch (type) {
            case RIFLEMAN:
                return new Rifleman(20, 0, 5);
            default:
                throw new UnsupportedOperationException("Nieznany typ");

        }
    }

    @Override
    public Tank createMechanizedUnit(UnitType type) {
        switch (type) {
            case TANK:
                return new Tank(100, 0, 25);
            default:
                throw new UnsupportedOperationException("Nieznany typ");
        }
    }

    @Override
    public AirUnit createAirUnit(UnitType type) {
        switch (type) {
            case HELICOPTER:
                return new Helicopter(90, 0, 22);
            default:
                throw new UnsupportedOperationException("Nieznany typ");
        }
    }
}
