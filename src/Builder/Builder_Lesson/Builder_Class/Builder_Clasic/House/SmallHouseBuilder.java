package Builder.Builder_Lesson.Builder_Class.Builder_Clasic.House;

public class SmallHouseBuilder implements HouseBuilder {

    private House house;

    public SmallHouseBuilder() {
        this.house = new House();
    }


    public void buildWals() {
        this.house.setWalls("Small Wals");
    }

    public void buildFlors() {
        this.house.setFlors("Small Flors");
    }

    public void buildRooms() {
        this.house.setRoom("Small Rooms");

    }

    public void buildRoof() {
        this.house.setRoof("Small Roof");
    }

    public void buildWindows() {
        this.house.setWindows("Small Windows");
    }

    public void buildDoors() {
        this.house.setDoors("Small Doors");
    }

    public void buildGarage() {
        this.house.setGarage("Small Garage");
    }

    public House getHouse() {
        return house;
    }
}
