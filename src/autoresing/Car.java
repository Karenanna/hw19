package autoresing;

public class Car extends Transport implements Competing {

    private final Integer maxSpeed;
    private final Integer pitStopTime;


    private final Integer bestLapTime;

    public Car(String brand, String model, Integer enginePower,
               Integer maxSpeed, Integer pitStopTime, Integer bestLapTime) {
        super(brand, model, enginePower);
        this.maxSpeed = maxSpeed;
        this.pitStopTime = pitStopTime;
        this.bestLapTime = bestLapTime;
        @Override
        void startToMove () {
            System.out.println("Car started");
        }

        @Override
        void finish () {
            System.out.println("Car finished");
        }

        @Override
        public void getPitStop () {
            System.out.println("truck pit-stop time is" + pitStopTime);

            @Override
            public void getBestLapTime () {
                System.out.println("truck best time is" + bestLapTime);

                @Override
                public void getMaxSpeed () {
                    System.out.println("truck max speed is");
                }
            }
        }
    }
}




