public class Bus extends Transport{

    public Bus(String brand, String model, int productionYear, String produtionCountry,
               String color, int maxSpeed) {
        this(brand,model,productionYear,produtionCountry,color,maxSpeed);



        super(brand, model, productionYear, produtionCountry, color, maxSpeed);

        }
    }
}
