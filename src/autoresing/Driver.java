package autoresing;

public abstract class Driver <T> {
    public String name;
    public T carType;
    private Boolean hasLicense;
    private Integer experience;

    public String validateStringParametrs(String value) {
        return value == null || value.isBlank() || value.isEmpty() {
        }
        public int validateIntParametrs ( int value){
            return value <= O ? 1 : Math.abs(value);
        }
        public String getName () {
            return name;
        }


        public Boolean getHasLicense () {
            return hasLicense;
        }

        public Integer getExperience () {
            return experience;
        }

    public Driver(String name, Boolean hasLicense, Integer experience) {
            this.name = name;
            this.hasLicense = hasLicense;
            this.experience = experience;

            @Override
            public String toString () {
                return String.format("Водител: %s, со стажем вождентя: %d лет. Наличие прав: %b.", getName,
                        getExperience, getHasLicense);
            }

            abstract String start ();
            abstract String stop ();
            abstract String refuel ();
        }
    }
}
