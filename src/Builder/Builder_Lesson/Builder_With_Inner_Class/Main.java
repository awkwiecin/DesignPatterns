package Builder.Builder_Lesson.Builder_With_Inner_Class;

import Builder.Builder_Lesson.Builder_With_Inner_Class.House.House;

public class Main {
    public static void main(String[] args) {


//    House house1 = new House("wals", "flors", "rooms", "windows", "doors","garage");
//    House house2 = new House("");

        House house = new House.HouseBulder()
                .buildWals("wals")
                .buildFlors("flors")
                .buildRoof("roof")
                .buildRoom("room")
                .build();
        System.out.println(house.getRoof());
    }
}
