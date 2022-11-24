public class Train extends Transport{
    public String brand;
    public String model;
    public int productionYear;
    public String produtionCountry;
    public int maxSpeed;
    public String departs;
    public String goTo;
    public  double cost;
    public int vagons;

    public Train(String brand, String model, int productionYear, String produtionCountry,
                 int maxSpeed, String departs, String goTo, double cost, int vagons) {
        super(brand,model,productionYear,produtionCountry,productionYear,maxSpeed, departs,goTo,cost,vagons);
    }
}

