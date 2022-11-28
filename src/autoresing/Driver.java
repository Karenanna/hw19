package autoresing;

public abstract class Driver {
    private final String name;
    private final Boolean hasLicense;
    private final Integer experience;

    public String getName() {return name;}


    public Boolean getHasLicense() {return hasLicense;}

    public Integer getExperience() {return experience;}

    public Driver(String name, Boolean hasLicense, Integer experience) {
        this.name = name;
        this.hasLicense = hasLicense;
        this.experience = experience;

        abstract String start ();
        abstract String stop ();
        abstract String refuel ();

    }
}
