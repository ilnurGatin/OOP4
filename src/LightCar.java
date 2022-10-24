public class LightCar extends Transport implements Competing {

    public LightCar(String brand, String model, float engineVolume) {
        super(brand, model, engineVolume);
    }

    public void startMoving() {
        System.out.println("Car start moving");
    }

    public void stopMoving() {
        System.out.println("Car stoped moving");
    }

    @Override
    public void pitStop() {
        System.out.println("Меняем колеса, заправляем бак");
    }

    @Override
    public void bestLapTimeSeconds(String time) {
        System.out.println("Лучшее время круга" + time + " секунд!");
    }

    @Override
    public void maxSpeed(int speed) {
        System.out.println("Максимальная скорость " + speed + " км/ч!");
    }
}
