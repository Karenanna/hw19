package autoresing;

public class DriverC < T extends Bus> extends Driver {
    public DriverC(String name, Boolean hasLicense, Integer experience) {
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
        return "Водитель" + getName() + "водит машину" + bus.getBrend() + " " + bus.GetModel() +
                "участвует в гонках";
    }
}
