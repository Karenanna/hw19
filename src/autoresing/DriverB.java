package autoresing;

public class DriverB < T extends Car> extends Driver {

    public DriverB(String name, Boolean hasLicense, Integer experience) {
        super(name, hasLicense, experience);
    }
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
    return "Водитель" + getName() + "водит машину" + car.getBrend() + " " + car.GetModel() +
        "участвует в гонках";
    }
}

