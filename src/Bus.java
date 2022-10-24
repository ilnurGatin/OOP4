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

        public static void determineCapacityType(CapacityType capacityType) {
            if (capacityType == null) {
                System.out.println("Данных недостаточно");
            } else {
                System.out.println("Тип вместимости автобуса: " + capacityType.getCapacityTypeDescription());
            }
        }

    }


    public Bus(String brand,
               String model,
               float engineVolume) {
        super(brand, model, engineVolume);
    }

    public void startMoving() {
        System.out.println("Bus starts moving");
    }

    public void stopMoving() {
        System.out.println("Bus stops moving");
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
