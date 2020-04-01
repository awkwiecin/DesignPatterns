package Builder.Builder_Lesson.Builder_Builder_With_Inner_Class.House;

public class House {

    private String walls;
    private String flors;
    private String room;
    private String roof;
    private String windows;
    private String doors;
    private String garage;

    private House(HouseBulder houseBulder){
        this.walls = houseBulder.walls;
        this.flors = houseBulder.flors;
        this.room = houseBulder.room;
        this.roof = houseBulder.roof;
        this.windows = houseBulder.windows;
        this.doors = houseBulder.doors;
        this.garage = houseBulder.garage;
    }


    public String getWalls() {
        return walls;
    }

    public String getFlors() {
        return flors;
    }

    public String getRoom() {
        return room;
    }

    public String getRoof() {
        return roof;
    }

    public String getWindows() {
        return windows;
    }

    public String getDoors() {
        return doors;
    }

    public String getGarage() {
        return garage;
    }

    @Override
    public String toString() {
        return "house{" +
                "walls='" + walls + '\'' +
                ", flors='" + flors + '\'' +
                ", room='" + room + '\'' +
                ", roof='" + roof + '\'' +
                ", windows='" + windows + '\'' +
                ", doors='" + doors + '\'' +
                ", garage='" + garage + '\'' +
                '}';
    }

    public static class HouseBulder {
        private String walls;
        private String flors;
        private String room;
        private String roof;
        private String windows;
        private String doors;
        private String garage;

        public HouseBulder buildWals(String walls){
            this.walls = walls;
            return this;
        }

        public HouseBulder buildFlors(String flors){
            this.flors = flors;
            return this;
        }

        public HouseBulder buildRoom(String room){
            this.room = room;
            return this;
        }

        public HouseBulder buildRoof(String roof){
            this.roof = roof;
            return this;
        }

        public HouseBulder buildWindows(String windows){
            this.windows = windows;
            return this;
        }

        public HouseBulder buildDoors(String doors){
            this.doors = doors;
            return this;
        }

        public HouseBulder buildGarage(String garage){
            this.garage = garage;
            return this;
        }

        public House build(){
            return new House(this);
        }


    }




}
