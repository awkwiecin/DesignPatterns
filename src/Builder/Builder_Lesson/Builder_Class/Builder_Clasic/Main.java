package Builder.Builder_Lesson.Builder_Class.Builder_Clasic;

import Builder.Builder_Lesson.Builder_Class.Builder_Clasic.House.BigHouseBuilder;
import Builder.Builder_Lesson.Builder_Class.Builder_Clasic.House.House;
import Builder.Builder_Lesson.Builder_Class.Builder_Clasic.House.HouseDirector;
import Builder.Builder_Lesson.Builder_Class.Builder_Clasic.House.SmallHouseBuilder;

public class Main {
    public static void main(String[] args) {


        SmallHouseBuilder smallHouseBuilder = new SmallHouseBuilder();
        BigHouseBuilder bigHouseBuilder = new BigHouseBuilder();

        HouseDirector smallHouseDirector = new HouseDirector(smallHouseBuilder);
        smallHouseDirector.buildHouse();

        HouseDirector bigHouseDirector = new HouseDirector(bigHouseBuilder);
        bigHouseDirector.buildHouse();

        House smallHouse = smallHouseDirector.getHouse();
        House bigHouse = bigHouseDirector.getHouse();

        System.out.println(smallHouse);
        System.out.println(bigHouse);

    }
}