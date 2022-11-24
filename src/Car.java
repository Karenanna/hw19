import java.security.Key;

public class Car{
    private final String brand;
    private final String model;
    private double engineVolume;
    private String color;
    private final int productionYear;
    private String produtionCountry;

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getProdutionCountry() {
        return produtionCountry;
    }

    public void setProdutionCountry(String produtionCountry) {
        this.produtionCountry = produtionCountry;
    }
    public Car(String brand, String model,
               double engineVolume, String color,
               int productionYear, String produtionCountry) {


        if (brand == null) {
            this.brand = "default";
        } else
            this.brand = brand;

        if (model == null) {
            this.model = "default";
        } else {
            this.model = model;
        }
        if (Double.compare(engineVolume, 0) == 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
        if (color == null) {
            this.color = "белый";
        } else {
            this.color = color;
        }
        if (Double.compare(productionYear, 0) == 0) {
            this.productionYear = 2000;
        } else {
            this.productionYear = productionYear;
        }
        if (produtionCountry == null) {
            this.produtionCountry = "default";
        } else {
            this.produtionCountry = produtionCountry;
        }
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }
}
