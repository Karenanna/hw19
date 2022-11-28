public class Train extends Transport{
//    public String brand;
//   public String model;
// public int productionYear;
//    public String produtionCountry;
//    public int maxSpeed;
//    public String color;
    public String departs;
    public String goTo;
    public  double cost;
    public int vagons;

    public Train(String brand, String model, int productionYear, String produtionCountry,
                 int maxSpeed, String color, String departs, String goTo, double cost, int vagons) {
        super(brand,model,productionYear,produtionCountry,color,maxSpeed);
        this.departs= departs;
        this.goTo=goTo;
        this.cost=cost;
        this.vagons=vagons;
    }
    @Override
    public void refill(String  typeOfFuel){
}

