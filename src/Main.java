public class Main {
    public static void main(String[] args) {

        Bus ikarus = new Bus("Ikarus", "B52", 5.0f, Bus.CapacityType.SMALL);
        Bus pasik = new Bus("PavlovBusFactory", "3205", 4.0f, Bus.CapacityType.VERY_SMALL );
        Bus lias = new Bus("Lipeck", "5952", 5.5f, Bus.CapacityType.VERY_BIG);
        Bus schoolBus = new Bus("IC Bus", "TypeA", 6.6f, Bus.CapacityType.MEDIUM);

        FreightCar kamaz = new FreightCar("Kamaz", "5992", 6.0f, FreightCar.СarryСapacity.N3);
        FreightCar maz = new FreightCar("Maz", "SuperMaz", 12.0f, FreightCar.СarryСapacity.N2);
        FreightCar scania = new FreightCar("Scania", "721", 8.5f, FreightCar.СarryСapacity.N3);
        FreightCar belaz = new FreightCar("Belaz", "999", 25.5f, FreightCar.СarryСapacity.N3);

        LightCar ladaGranta = new LightCar("Lada", "Granta", 1.6f, LightCar.BodyType.HATCHBACK);
        LightCar audiA8 = new LightCar("Audi", "R8", 3.0f, LightCar.BodyType.SEDAN);
        LightCar bmwZ8 = new LightCar("BMW", "Z8", 5.0f, LightCar.BodyType.COUPE);
        LightCar kiaSportage = new LightCar("Kia", "Sportage 4th generation", 2.4F, null);

        DriverB ivan = new DriverB("Ivanov Ivan Ivanovich", 1, ladaGranta);
        DriverD sergey = new DriverD("Petrov Sergey Mihailovich", 8, lias);
        DriverC fedor = new DriverC("Sidorov Fedor Evgenievich", 4, kamaz);

        raceTeam(ivan);
        carType(audiA8);

        diagnostic(
                ikarus, pasik, lias, schoolBus,
                ladaGranta, audiA8, bmwZ8, kiaSportage,
                kamaz, maz, scania, belaz
        );
    }

    public static void raceTeam(Driver driver) {
       System.out.println("Водитель " + driver.getFullName() + " управляет автомобилем " + driver.getCar().getBrand() +
               " " + driver.getCar().getModel() + " и будет участвовать в заезде." );

    }

    public static void carType(Transport transport) {
        transport.printType();
    }

    public static void diagnostic(Transport... transports) {
        for (Transport transport : transports) {
            try {
                diagnostTransport(transport);
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static void diagnostTransport(Transport transport) {
        if (!transport.passDiagnostic()) {
            throw new RuntimeException("Автомобиль " + transport.getBrand() + " " + transport.getModel() + " не прошел диагностику");
        }
    }
}