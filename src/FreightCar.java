public class FreightCar extends Transport implements Competing {

    public FreightCar(String brand, String model, float engineVolume) {
        super(brand, model, engineVolume);
    }

    public void startMoving() {
        System.out.println("FreightCar start moving");
    }

    public void stopMoving() {
        System.out.println("FreightCar stop moving");
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
