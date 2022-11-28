package autoresing;

public class DriverD < T extends Truck> extends Driver{
    public DriverD(String name, Boolean hasLicense, Integer experience) {
        super(name, hasLicense, experience);
        @Override
        public String getPitStop() {

            return "Машина завелась";}
    }
    @Override
    public String getBestLapTime() {
        return "Машина остоновилась";}
}
    @Override
    public String getMaxSpeed() {
        return "Машина заправилась";}
    public String getCar (Car car){
        return "Водитель" + getName() + "водит машину" + truck.getBrend() + " " + truck.GetModel() +
                "участвует в гонках";
    }
}
