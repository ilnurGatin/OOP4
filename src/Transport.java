import java.util.ArrayList;
import java.util.List;

public abstract class Transport {
    private String brand;
    private String model;
    private float engineVolume;

    private Driver driver;

    List<Sponsor> sponsorList;

    List<Mechanic> mechanics;

    public Transport(String brand, String model, float engineVolume, List<Sponsor> sponsorList,
                     List<Mechanic> mechanics) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.sponsorList = sponsorList;
        this.mechanics = mechanics;
    }

    public abstract void startMoving();

    public abstract void stopMoving();

    public List<Mechanic> getMechanics() {
        return mechanics;
    }

    public List<Sponsor> getSponsorList() {
        return sponsorList;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public float getEngineVolume() {
        return engineVolume;
    }
    public abstract void printType();

    public abstract boolean passDiagnostic();

}
