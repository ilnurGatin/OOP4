import com.sun.source.doctree.SeeTree;

import java.util.List;
import java.util.Set;

public class LightCar extends Transport implements Competing {

    public enum BodyType {
        SEDAN("Sedan"),
        HATCHBACK("Hatchback"),
        COUPE("Coupe"),
        UNIVERSAL("Universal"),
        SUV("SUV"),
        CROSSOVER("Crossover"),
        PICKUP("Pickup"),
        VAN("Van"),
        MINIVAN("Minivan");

        private final String bodyTypeTitle;

        BodyType(String bodyTypeTitle) {
            this.bodyTypeTitle = bodyTypeTitle;
        }

        public String getBodyTypeTitle() {
            return bodyTypeTitle;
        }
    }

    private BodyType bodyType;

    public LightCar(String brand, String model, float engineVolume, BodyType bodyType, Set sponsorList, Set mechanics) {
        super(brand, model, engineVolume, sponsorList, mechanics);
        this.bodyType = bodyType;
    }

    public BodyType getBodyType() {
        return bodyType;
    }

    public void setBodyType(BodyType bodyType) {
        this.bodyType = bodyType;
    }

    public void startMoving() {
        System.out.println("Car start moving");
    }

    public void stopMoving() {
        System.out.println("Car stoped moving");
    }

    @Override
    public void printType() {
        if (bodyType == null) {
            System.out.println("Данных недостаточно");
        } else {
            System.out.println("Кузов автомобиля: " + bodyType.getBodyTypeTitle());
        }
    }

    @Override
    public boolean passDiagnostic() {
        if (super.getEngineVolume() > 3.0) {
            return true;
        } else {
            return false;
        }
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
