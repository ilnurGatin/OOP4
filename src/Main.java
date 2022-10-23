public class Main {
    public static void main(String[] args) {

        Bus ikarus = new Bus("Ikarus", "B52", 5.0f);
        Bus pasik = new Bus("PavlovBusFactory", "3205", 4.0f);
        Bus lias = new Bus("Lipeck", "5952", 5.5f);
        Bus schoolBus = new Bus("IC Bus", "TypeA", 6.6f);

        FreightCar kamaz = new FreightCar("Kamaz", "5992", 6.0f);
        FreightCar maz = new FreightCar("Maz", "SuperMaz", 12.0f);
        FreightCar scania = new FreightCar("Scania", "721", 8.5f);
        FreightCar belaz = new FreightCar("Belaz", "999", 25.5f);

        LightCar ladaGranta = new LightCar("Lada", "Granta", 1.6f);
        LightCar audiA8 = new LightCar("Audi", "R8", 3.0f);
        LightCar bmwZ8 = new LightCar("BMW", "Z8", 5.0f);
        LightCar kiaSportage = new LightCar("Kia", "Sportage 4th generation", 2.4F);

    }
}