package Builder.Builder_Lesson.Builder_Class.House;

public class House {


    private String walls;
    private String flors;
    private String room;
    private String roof;
    private String windows;
    private String doors;
    private String garage;

    public String getWalls() {
        return walls;
    }

    public void setWalls(String walls) {
        this.walls = walls;
    }

    public String getFlors() {
        return flors;
    }

    public void setFlors(String flors) {
        this.flors = flors;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public String getRoof() {
        return roof;
    }

    public void setRoof(String roof) {
        this.roof = roof;
    }

    public String getWindows() {
        return windows;
    }

    public void setWindows(String windows) {
        this.windows = windows;
    }

    public String getDoors() {
        return doors;
    }

    public void setDoors(String doors) {
        this.doors = doors;
    }

    public String getGarage() {
        return garage;
    }

    public void setGarage(String garage) {
        this.garage = garage;
    }

    @Override
    public String toString() {
        return "House{" +
                "walls='" + walls + '\'' +
                ", flors='" + flors + '\'' +
                ", room='" + room + '\'' +
                ", roof='" + roof + '\'' +
                ", windows='" + windows + '\'' +
                ", doors='" + doors + '\'' +
                ", garage='" + garage + '\'' +
                '}';
    }
}


