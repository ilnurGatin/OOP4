import java.util.List;
import java.util.Objects;

public class Mechanic {

    private String fullName;
    private String companyName;
    private boolean fixLightCar;
    private boolean fixFreightCar;
    private boolean fixBus;

    public Mechanic(String fullName, String companyName,
                    boolean fixLightCar, boolean fixFreightCar, boolean fixBus) {
        this.fullName = fullName;
        this.companyName = companyName;
        this.fixBus = fixBus;
        this.fixLightCar = fixLightCar;
        this.fixFreightCar = fixFreightCar;
    }

    public boolean isFixLightCar() {
        return fixLightCar;
    }

    public boolean isFixFreightCar() {
        return fixFreightCar;
    }

    public boolean isFixBus() {
        return fixBus;
    }

    public String getFullName() {
        return fullName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void checkTransport(Transport transport){

    }

    public void fixTransport(Transport transport) {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mechanic mechanic = (Mechanic) o;
        return Objects.equals(fullName, mechanic.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName);
    }

    @Override
    public String toString() {
        return "Mechanic{" +
                "fullName='" + fullName + '\'' +
                ", companyName='" + companyName + '\'' +
                ", fixLightCar=" + fixLightCar +
                ", fixFreightCar=" + fixFreightCar +
                ", fixBus=" + fixBus +
                '}';
    }
}
