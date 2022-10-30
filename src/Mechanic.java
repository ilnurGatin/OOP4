import java.util.List;

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
