package autoresing;

public class Truck extends Transport implements Competing {
    private final Integer maxSpeed;
    private final Integer pitStopTime;

    private final Integer bestLapTime;


    public Truck(String brand, String model, int productionYear,
                 String produtionCountry, String color, int maxSpeed, Integer pitStopTime,
                 Integer maxSpeed1, Integer bestLapTime) {
        super(brand, model, productionYear, produtionCountry, color, maxSpeed);
        this.pitStopTime = pitStopTime;
        this.maxSpeed = maxSpeed1;
        this.bestLapTime = bestLapTime;


        @Override
    void startToMove() {System.out.println("Truck started");}

        @Override
    void finish()  {System.out.println("Truck finished"); }

        @Override
    public void getPitStop() {System.out.println("truck pit-stop time is" + pitStopTime);

         @Override
      public void getBestLapTime()  {System.out.println("truck best time is"+ bestLapTime);

         @Override
    public void getMaxSpeed(){System.out.println("truck max speed is"); }

    }
}
