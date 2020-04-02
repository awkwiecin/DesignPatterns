package Factory.Lesson.FactoryAbstract.Unit;

public class RedFactory extends Factory {
    @Override
    public InfantryUnit createInfantryUnit(UnitType type) {
        switch (type) {
            case RIFLEMAN:
                return new Rifleman(15, 0, 6);
            default:
                throw new UnsupportedOperationException("Nieznany typ");

        }
    }

    @Override
    public Tank createMechanizedUnit(UnitType type) {
        switch (type){
            case TANK:
                return new Tank(80,0,30);
            default:
                throw new UnsupportedOperationException("Nieznany typ");
        }
    }

    @Override
    public AirUnit createAirUnit(UnitType type) {
        switch (type){
            case HELICOPTER:
                return new Helicopter(70,0,20);
            default:
                throw new UnsupportedOperationException("Nieznany typ");
        }
}
}
