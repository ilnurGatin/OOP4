import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public abstract class Transport {
    private String brand;
    private String model;
    private float engineVolume;

    private Driver driver;

    Set<Sponsor> sponsorList;

    Set<Mechanic> mechanics;

    public Transport(String brand, String model, float engineVolume, Set<Sponsor> sponsorList,
                     Set<Mechanic> mechanics) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.sponsorList = sponsorList;
        this.mechanics = mechanics;
    }

    public abstract void startMoving();

    public abstract void stopMoving();

    public Set<Mechanic> getMechanics() {
        return mechanics;
    }

    public Set<Sponsor> getSponsorList() {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return Float.compare(transport.engineVolume, engineVolume) == 0 && Objects.equals(brand, transport.brand) && Objects.equals(model, transport.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, engineVolume);
    }
}
