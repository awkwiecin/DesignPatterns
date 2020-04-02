package Builder.Builder_Practice.FlightLeg;


public class FlightLeg {

    private final String from;
    private final String to;
    private String delayed;
    private int price;

    public FlightLeg(FlightLegBuilder builder) {
        this.from = builder.from;
        this.to = builder.to;
        this.delayed = builder.delayed;
        this.price = builder.price;
    }



    public void setDelayed(String delayed) {
        this.delayed = delayed;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "FlightLeg{" +
                "from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", delayed='" + delayed + '\'' +
                ", price=" + price +
                '}';
    }

    public static class FlightLegBuilder{

        private  String from;
        private  String to;
        private  String delayed;
        private int price;



        public FlightLegBuilder from (String from){
            this.from = from;
            return this;
        }

        public FlightLegBuilder to(String to){
            this.to = to;
            return this;
        }

        public FlightLegBuilder delayed(String delayed){
            this.delayed = delayed;
            return this;
        }

        public FlightLegBuilder price (int price){
            this.price = price;
            return this;
        }

        public FlightLeg build(){
            if(this.price == 0){
                throw new IllegalStateException("Cena za lot jest wymagana");
            }
            return new FlightLeg(this);
        }


    }
}