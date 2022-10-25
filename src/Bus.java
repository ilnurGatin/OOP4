public class Bus extends Transport implements Competing {

    public enum CapacityType {
        VERY_SMALL("До 10 мест"),
        SMALL("До 25 мест"),
        MEDIUM("От 40 до 50 мест"),
        BIG("От 60 до 80 мест"),
        VERY_BIG("От 100 до 120 мест");

        private final String capacityTypeDescription;

        CapacityType(String capacityTypeDescription) {
            this.capacityTypeDescription = capacityTypeDescription;
        }

        public String getCapacityTypeDescription() {
            return capacityTypeDescription;
        }
    }

    private CapacityType capacityType;

    public Bus(String brand,
               String model,
               float engineVolume,
               CapacityType capacityType) {
        super(brand, model, engineVolume);
        this.capacityType = capacityType;
    }

    public CapacityType getCapacityType() {
        return capacityType;
    }

    public void setCapacityType(CapacityType capacityType) {
        this.capacityType = capacityType;
    }

    public void startMoving() {
        System.out.println("Bus starts moving");
    }

    public void stopMoving() {
        System.out.println("Bus stops moving");
    }

    @Override
    public void printType() {
        if (capacityType == null) {
            System.out.println("Данных недостаточно");
        } else {
            System.out.println("Тип вместимости автобуса: " + capacityType.getCapacityTypeDescription());
        }
    }

    @Override
    public void pitStop() {
        System.out.println("Протираем окошки");
    }

    @Override
    public void bestLapTimeSeconds(String time) {
        System.out.println("Лучшее время круга " + time + " секунд");
    }

    @Override
    public void maxSpeed(int speed) {
        System.out.println("Максимальная скорость " + speed + " км/ч");
    }
}
