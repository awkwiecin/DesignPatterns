package Builder.Builder_Lesson.Builder_Class.Builder_Clasic.House;

public class BigHouseBuilder implements HouseBuilder {
    private House house;

    public BigHouseBuilder() {
        this.house = new House();
    }


    public void buildWals() {
        this.house.setWalls("Big Wals");
    }

    public void buildFlors() {
        this.house.setFlors("Big Flors");
    }

    public void buildRooms() {
        this.house.setRoom("Big Rooms");

    }

    public void buildRoof() {
        this.house.setRoof("Big Roof");
    }

    public void buildWindows() {
        this.house.setWindows("Big Windows");
    }

    public void buildDoors() {
        this.house.setDoors("Big Doors");
    }

    public void buildGarage() {
        this.house.setGarage("Big Garage");
    }

    public House getHouse() {
        return house;
    }
}
