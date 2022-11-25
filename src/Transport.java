public abstract class  Transport {
    private String brand;
    private String model;
    private  int productionYear;
    private  String produtionCountry;
    private String color;
    private int maxSpeed;



    public Transport(String brand, String model, int productionYear, String produtionCountry, String color, int maxSpeed) {
        this.brand = brand;
        this.model = model;
        this.productionYear = productionYear;
        this.produtionCountry = produtionCountry;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
    public abstract void refill();


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand= brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model == null || model.isBlank() || model.isEmpty()){
            this.model = "default";
        }else {

        }
        this.model = model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getProdutionCountry() {
        return produtionCountry;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}

