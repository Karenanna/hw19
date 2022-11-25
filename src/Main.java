public class Main {
    public static void main(String[] args) {
        Car grande = new Car("Lada", "Grande", 1.7, "желтый", 2015, "Россия");
        Car audi = new Car("Audi", "A8 50L TDI", 3.0, "черный", 2020, "Германия");
        Car bmw = new Car("Bmw", "Z8", 3.0, "черный", 2021, "Германия");
        Car kia = new Car("Kia", "Sportage4", 2.4, "красный", 2018, "Южная Корея");
        Car hyundai = new Car("Hyundai", "Avante", 1.6, "красный", 2016, "Южная Корея");

        Train lastochka = new Train("Ласточка","B-901",2011,
                "Россия", 301,"желтый","Белорусский вокзал",
                "станция Минск-Пассажирский", 3500,11 );

       System.out.println("Поезд " + lastochka.brand+ ", модель " + lastochka.model +                ", год выпуска "+ lastochka.productionYear + ", сделано " + lastochka.produtionCountry+
                           ", скорость передвижения" + lastochka.maxSpeed + ". Название станции отбития" + lastochka.departs +
                            ". Конечная остоновка " + lastochka.goTo + ". Цена поездки " + lastochka.cost + " рублей " + "в поезде " +                lastochka.vagons + " вагонов.");

        Train leningrad= new Train("Ленинград","D-125", 2019, "Россия",
                270,"красный","Ленинградский вокзал","станция Ленинград-Пассажирский",
                1700, 8);


        System.out.println("Поезд " + leningrad.brand+ ", модель " + leningrad.model +
                ", год выпуска "+ leningrad.productionYear + ", сделано " + leningrad.produtionCountry+
                ", скорость передвижения " + leningrad.maxSpeed + ". Название станции отбития"+ leningrad.departs +
               ". Конечная остоновка " + leningrad.goTo + ". Цена поездки "+ leningrad.cost + " рублей " + ", в поезде" +
                leningrad.vagons + " вагонов.");
        Bus busFirst = new Bus("Икарус", "M-111",1985, "Венгрия",
                "желтый", 120);
        Bus busSecond = new Bus("Маз", "Маз123", 2009,"Белоруссия",
                "белый", 150);
        Bus busThird = new Bus("Ман", "Superbus", 2020, "Германия",
                "красный", 200);
        System.out.println(busFirst +"\n" + busSecond + "\n" + busThird + "\n" );




        printInfo(grande);
        printInfo(audi);
        printInfo(bmw);
        printInfo(kia);
        printInfo(hyundai);


    }

    private static void printInfo(Car car) {
        System.out.println(
              //  car.getBrand() + " " +
              //          car.getModel() +
                                " " + "страна сборки: " +
                        car.getProdutionCountry() + ", цвет кузова: " +
                        car.getColor() + ", объем двигателя: " +
                        car.getEngineVolume());

    }
}
