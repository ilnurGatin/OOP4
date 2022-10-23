public class LightCar {

    private String brand;
    private String model;
    private float engineVolume;

    public LightCar(String brand, String model, float engineVolume) {
        setBrand(brand);
        setModel(model);
        setEngineVolume(engineVolume);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = ValidationUtils.validOrDefault(brand, "Default");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = ValidationUtils.validOrDefault(model, "Default");
    }

    public float getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(float engineVolume) {
        this.engineVolume = engineVolume > 0 ? engineVolume : 5.5f;
    }

    public void startMoving() {
        System.out.println("Start moving");
    }

    public void stopMoving() {
        System.out.println("Stop moving");
    }
}
