package autoresing;

import static autoresing.ValidateUtils.volidateString;

public abstract class  Transport {

    private String brand;
    private String model;
    private final Integer enginePower;

    public Transport(String brand, String model, Integer enginePower) {
        this.brand =validateCarParameters(brand);
        this.model =validateCarParameters (model);
        this.enginePower =validateInteger (enginePower);
    }

    public Integer getEnginePower() {
        return enginePower;
    }
    //  private  int productionYear;
    //  private  String produtionCountry;
    //  private String color;
    //  private int maxSpeed;


    //  public Transport(String brand, String model, int productionYear, String produtionCountry, String color, int maxSpeed) {
    //      this.brand = brand;
    //      this.model = model;
    //      this.productionYear = productionYear;
    //      this.produtionCountry = produtionCountry;
    //      this.color = color;
    //      this.maxSpeed = maxSpeed;
    //  }
    public abstract void refill();


    public String getBrand() {
        return brand;
    }

    //  public void setBrand(String brand) {
    //      this.brand= brand;
    //  }

    public String getModel() {
        return model;
        abstract void startToMove ();
        abstract void finish ();

        validation


      @Override
      public String toString() {
            return "Transport{" + "brend='" + brand + '\'' +
                    ", model='" + model + '\'' + ", enginePower="
                    + enginePower + '}';
        }
    }

    //  public void setModel(String model) {
    //      if (model == null || model.isBlank() || model.isEmpty()){
    //          this.model = "default";
    //      }else {

}

