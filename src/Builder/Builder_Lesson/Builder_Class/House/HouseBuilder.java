package Builder.Builder_Lesson.Builder_Class.House;

public interface HouseBuilder {
    void buildWals();
    void buildFlors();
    void buildRooms();
    void buildRoof();
    void buildWindows();
    void buildDoors();
    void buildGarage();

    House getHouse();
}
