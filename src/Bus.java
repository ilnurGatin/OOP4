public class Bus extends Transport implements Competing {


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
