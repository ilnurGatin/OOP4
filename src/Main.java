
import java.sql.SQLOutput;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Sponsor cocaCola = new Sponsor("Coca Cola", 100_000_000);
        Sponsor continental = new Sponsor("Continental", 5_000_000);
        Sponsor yokohama = new Sponsor("Yorkohama", 1_500_00);

        Set<Sponsor> sponsorsForIkarus = new HashSet<>();
        sponsorsForIkarus.add(cocaCola);

        Set<Sponsor> sponsorsForPasic = new HashSet<>();
        sponsorsForPasic.add(cocaCola);

        Set<Sponsor> sponsorsForLias = new HashSet<>();
        sponsorsForLias.add(cocaCola);

        Set<Sponsor> sponsorsForLadaGranta = new HashSet<>();
        sponsorsForLadaGranta.add(cocaCola);

        Set<Sponsor> sponsorsForSchoolBus = new HashSet<>();
        sponsorsForSchoolBus.add(cocaCola);

        Set<Sponsor> sponsorsForKamaz = new HashSet<>();
        sponsorsForKamaz.add(cocaCola);

        Set<Sponsor> sponsorsForMaz = new HashSet<>();
        sponsorsForMaz.add(cocaCola);

        Set<Sponsor> sponsorsForScania = new HashSet<>();
        sponsorsForScania.add(cocaCola);

        Set<Sponsor> sponsorsForBelaz = new HashSet<>();
        sponsorsForBelaz.add(cocaCola);

        Set<Sponsor> sponsorsForAudi = new HashSet<>();
        sponsorsForIkarus.add(cocaCola);

        Set<Sponsor> sponsorsForBMW = new HashSet<>();
        sponsorsForIkarus.add(cocaCola);

        Set<Sponsor> sponsorsForKia = new HashSet<>();
        sponsorsForIkarus.add(cocaCola);

        Mechanic sergeeich = new Mechanic("Sergeevich", "Рога и копыта", true, true, true);
        Mechanic sanSanich = new Mechanic("Alexander Alexandrovich", "Too fast, too furious", true, true, true);

        Set<Mechanic> mechanics = new HashSet<>();
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

        Set<Transport> transportListForCocaCola = new HashSet<>();
        transportListForCocaCola.add(ladaGranta);
        transportListForCocaCola.add(kamaz);
        transportListForCocaCola.add(lias);
        transportListForCocaCola.add(kiaSportage);
        transportListForCocaCola.add(ikarus);

        Set<Transport> transportListForContinental = new HashSet<>();
        transportListForContinental.add(audiA8);
        transportListForContinental.add(maz);

        Set<Transport> transportListForYokohama = new HashSet<>();
        transportListForYokohama.add(kiaSportage);
        transportListForYokohama.add(schoolBus);

        Set<Sponsor> sponsorsList = new HashSet<>();
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

        Set<Transport> transportList = new HashSet<>();
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

        ServiceStation station = new ServiceStation();

        station.addTransport(kiaSportage);
        station.addTransport(ladaGranta);
        station.addTransport(audiA8);
        station.runDiagnostic();
    }

    public static void raceTeam(Driver driver) {
        System.out.println("Водитель " + driver.getFullName() + " управляет автомобилем " + driver.getCar().getBrand() +
                " " + driver.getCar().getModel() + " и будет участвовать в заезде.");
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

//    public static String getSponsorsName(Set list) {
//        String sponsorsNames = "";
//        for (int i = 0; i < list.size(); i++) {
//            if (list.get(i) != null && i == list.size() - 1) {
//                Sponsor sponsor = (Sponsor) list.get(i);
//                sponsorsNames += sponsor.getName();
//            } else if (list.get(i) != null) {
//                Sponsor sponsor = (Sponsor) list.get(i);
//                sponsorsNames += sponsor.getName() + ", ";
//            }
//
//        }
//        return sponsorsNames;
//    }
//    public static String getMechanicsName(Set list) {
//        String mechanicName = "";
//        for (int i = 0; i < list.size(); i++) {
//            if (list.get(i) != null && i == list.size() - 1) {
//                Mechanic mechanic = (Mechanic) list.get(i);
//                mechanicName += mechanic.getFullName();
//            } else if (list.get(i) != null) {
//                Mechanic mechanic = (Mechanic) list.get(i);
//                mechanicName += mechanic.getFullName() + ", ";
//            }
//
//        }
//        return mechanicName;
//    }

}


