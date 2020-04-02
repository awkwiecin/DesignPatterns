package Builder.Builder_Practice;

import Builder.Builder_Practice.FlightLeg.FlightLeg;

public class Main {
    public static void main(String[]args){
        FlightLeg leg = new FlightLeg.FlightLegBuilder()
                .from("Las Vegas")
                .to("Los Angeles")
                .price(50)
                .build();


                System.out.println(leg);
    }


}
