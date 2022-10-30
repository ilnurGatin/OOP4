
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Sponsor cocaCola = new Sponsor("Coca Cola", 100_000_000);
        Sponsor continental = new Sponsor("Continental", 5_000_000);
        Sponsor yokohama = new Sponsor("Yorkohama", 1_500_00);

        List<Sponsor> sponsorsForIkarus = new ArrayList<>();
        sponsorsForIkarus.add(cocaCola);

        List<Sponsor> sponsorsForPasic = new ArrayList<>();
        sponsorsForPasic.add(cocaCola);

        List<Sponsor> sponsorsForLias = new ArrayList<>();
        sponsorsForLias.add(cocaCola);

        List<Sponsor> sponsorsForLadaGranta = new ArrayList<>();
        sponsorsForLadaGranta.add(cocaCola);

        List<Sponsor> sponsorsForSchoolBus = new ArrayList<>();
        sponsorsForSchoolBus.add(cocaCola);

        List<Sponsor> sponsorsForKamaz = new ArrayList<>();
        sponsorsForKamaz.add(cocaCola);

        List<Sponsor> sponsorsForMaz = new ArrayList<>();
        sponsorsForMaz.add(cocaCola);

        List<Sponsor> sponsorsForScania = new ArrayList<>();
        sponsorsForScania.add(cocaCola);

        List<Sponsor> sponsorsForBelaz = new ArrayList<>();
        sponsorsForBelaz.add(cocaCola);

        List<Sponsor> sponsorsForAudi = new ArrayList<>();
        sponsorsForIkarus.add(cocaCola);

        List<Sponsor> sponsorsForBMW = new ArrayList<>();
        sponsorsForIkarus.add(cocaCola);

        List<Sponsor> sponsorsForKia = new ArrayList<>();
        sponsorsForIkarus.add(cocaCola);

        Mechanic sergeeich = new Mechanic("Sergeevich", "Рога и копыта", true, true, true);
        Mechanic sanSanich = new Mechanic("Alexander Alexandrovich", "Too fast, too furious", true, true, true);

        List<Mechanic> mechanics = new ArrayList<>();
        mechanics.add(sergeeich);
        mechanics.add(sanSanich);

        Bus ikarus = new Bus("Ikarus", "B52", 5.0f, Bus.CapacityType.SMALL, sponsorsForIkarus, mechanics);
        Bus pasik = new Bus("PavlovBusFactory", "3205", 4.0f, Bus.CapacityType.VERY_SMALL, sponsorsForPasic, mechanics);
        Bus lias = new Bus("Lipeck", "5952", 5.5f, Bus.CapacityType.VERY_BIG, sponsorsForLias, mechanics);
        Bus schoolBus = new Bus("IC Bus", "TypeA", 6.6f, Bus.CapacityType.MEDIUM, sponsorsForSchoolBus, mechanics);

        FreightCar kamaz = new FreightCar("Kamaz", "5992", 6.0f, FreightCar.СarryСapacity.N3, sponsorsForKamaz, mechanics);
        FreightCar maz = new FreightCar("Maz", "SuperMaz", 12.0f, FreightCar.СarryСapacity.N2, sponsorsForMaz, mechanics);
        FreightCar scania = new FreightCar("Scania", "721", 8.5f, FreightCar.СarryСapacity.N3, sponsorsForScania, mechanics);
        FreightCar belaz = new FreightCar("Belaz", "999", 25.5f, FreightCar.СarryСapacity.N3, sponsorsForBelaz, mechanics);

        LightCar ladaGranta = new LightCar("Lada", "Granta", 1.6f, LightCar.BodyType.HATCHBACK, sponsorsForLadaGranta, mechanics);
        LightCar audiA8 = new LightCar("Audi", "R8", 3.0f, LightCar.BodyType.SEDAN, sponsorsForAudi, mechanics);
        LightCar bmwZ8 = new LightCar("BMW", "Z8", 5.0f, LightCar.BodyType.COUPE, sponsorsForBMW, mechanics);
        LightCar kiaSportage = new LightCar("Kia", "Sportage 4th generation", 2.4F, null, sponsorsForKia, mechanics);

        DriverB ivan = new DriverB("Ivanov Ivan Ivanovich", 1, ladaGranta);
        DriverB fedot = new DriverB("Fedotov Fedot Deffforovicj", 7, audiA8);

        DriverC fedor = new DriverC("Sidorov Fedor Evgenievich", 4, kamaz);
        DriverD sergey = new DriverD("Petrov Sergey Mihailovich", 8, lias);
        DriverD petrovich = new DriverD("Петрович", 5, ikarus);

        List<Transport> transportListForCocaCola = new ArrayList<>();
        transportListForCocaCola.add(ladaGranta);
        transportListForCocaCola.add(kamaz);
        transportListForCocaCola.add(lias);
        transportListForCocaCola.add(kiaSportage);
        transportListForCocaCola.add(ikarus);

        List<Transport> transportListForContinental = new ArrayList<>();
        transportListForContinental.add(audiA8);
        transportListForContinental.add(maz);

        List<Transport> transportListForYokohama = new ArrayList<>();
        transportListForYokohama.add(kiaSportage);
        transportListForYokohama.add(schoolBus);

        List<Sponsor> sponsorsList = new ArrayList<>();
        sponsorsList.add(cocaCola);
        sponsorsList.add(continental);
        sponsorsList.add(yokohama);

        //Инфо по команде
        raceTeam(ivan);

        //Тип Кузова:
        System.out.printf("Тип кузова для %s %s", audiA8.getBrand(), audiA8.getModel());
        carType(audiA8);

        diagnostic(
                ikarus, pasik, lias, schoolBus,
                ladaGranta, audiA8, bmwZ8, kiaSportage,
                kamaz, maz, scania, belaz
        );

        List<Transport> transportList = new ArrayList<>();
        transportList.add(ikarus);
        transportList.add(lias);
        transportList.add(pasik);
        transportList.add(schoolBus);
        transportList.add(kamaz);
        transportList.add(maz);
        transportList.add(scania);
        transportList.add(belaz);
        transportList.add(ladaGranta);
        transportList.add(audiA8);
        transportList.add(bmwZ8);
        transportList.add(kiaSportage);

    }

    public static void raceTeam(Driver driver) {
        System.out.println("Водитель " + driver.getFullName() + " управляет автомобилем " + driver.getCar().getBrand() +
                " " + driver.getCar().getModel() + " и будет участвовать в заезде. Спонсоры команды: " + getSponsorsName(driver.getCar().getSponsorList()) +
                ". Механики: " + getMechanicsName(driver.getCar().getMechanics()));
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

    public static String getSponsorsName(List list) {
        String sponsorsNames = "";
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) != null && i == list.size() - 1) {
                Sponsor sponsor = (Sponsor) list.get(i);
                sponsorsNames += sponsor.getName();
            } else if (list.get(i) != null) {
                Sponsor sponsor = (Sponsor) list.get(i);
                sponsorsNames += sponsor.getName() + ", ";
            }

        }
        return sponsorsNames;
    }
    public static String getMechanicsName(List list) {
        String mechanicName = "";
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) != null && i == list.size() - 1) {
                Mechanic mechanic = (Mechanic) list.get(i);
                mechanicName += mechanic.getFullName();
            } else if (list.get(i) != null) {
                Mechanic mechanic = (Mechanic) list.get(i);
                mechanicName += mechanic.getFullName() + ", ";
            }

        }
        return mechanicName;
    }
}


