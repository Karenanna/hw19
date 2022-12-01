package autoresing;




public class Main {
    public static void main(String[] args) {
        Car suzuki = new Car("Suzuki", "GTI2", 4, 450, 4,
                5);
        Car honda = new Car("Honda", "Civic", 5, 450, 4,
                6);
        Car mitsubishi = new Car("Mitsubishi", "Lanser", 5, 460, 4,
                7);

        Bus maz = new Bus("Maz", "3344", 3, 200, 4, 3);
        Bus man = new Bus("Man", "4455", 4, 220, 5, 4);
        Bus kamaz = new Bus("Kamaz", "5566", 5, 280, 4, 7);

        System.out.println(suzuki);
        System.out.println(honda);
        System.out.println(mitsubishi);

        System.out.println(maz);
        System.out.println(man);
        System.out.println(kamaz);


        DriverB<Car> boyko = new DriverB<>("Бойко Сергей Андреевич", true, 10);
        DriverB<Car> golunov = new DriverB<>("Голунов Андрей Викторович", true, 14);
        DriverD<Bus> agapov = new DriverD<Bus>("Агапов Василий Петрович", true, 12);

        suzuki.getMaxSpeed();
        maz.getMaxSpeed();
        man.getBestLapTime();


    }
}

