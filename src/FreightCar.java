import java.awt.geom.Dimension2D;

public class FreightCar extends Transport implements Competing {

    public enum СarryСapacity {
        N1("C полной массой до 3,5 тонн"),
        N2("C полной массой свыше 3,5 до 12 тонн"),
        N3("C полной массой свыше 12 тонн");

        private final String carryСapacityDescription;

        СarryСapacity(String carryСapacityDescription) {
            this.carryСapacityDescription = carryСapacityDescription;
        }

        public String getCarryСapacityDescription() {
            return carryСapacityDescription;
        }
    }

    private СarryСapacity carryCapacity;

    public FreightCar(String brand, String model, float engineVolume, СarryСapacity carryCapacity) {
        super(brand, model, engineVolume);
        this.carryCapacity = carryCapacity;
    }

    public СarryСapacity getCarryCapacity() {
        return carryCapacity;
    }

    public void setCarryCapacity(СarryСapacity carryCapacity) {
        this.carryCapacity = carryCapacity;
    }

    public void startMoving() {
        System.out.println("FreightCar start moving");
    }

    public void stopMoving() {
        System.out.println("FreightCar stop moving");
    }

    @Override
    public void printType() {
        if (carryCapacity == null) {
            System.out.println("Данных недостаточно");
        } else {
            System.out.println("Тип грузоподъемности авто: " + carryCapacity.getCarryСapacityDescription());
        }
    }

    @Override
    public void pitStop() {
        System.out.println("Заправляем бак, если сможем - поменяем одно колесо на выбор!");
    }

    @Override
    public void bestLapTimeSeconds(String time) {
        System.out.println("Лучшее время " + time + "минут");
    }

    @Override
    public void maxSpeed(int speed) {
        System.out.println("Максимальная скорость " + speed + " км/ч");
    }
}
