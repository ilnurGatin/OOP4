public class Bus {

    private String brand;
    private String model;
    private float engineVolume;

    public Bus(String brand,
               String model,
               float engineVolume) {
        //super(brand, model, productionYear, productionCountry, color, maxSpeed);
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
        this.engineVolume = engineVolume > 0 ? engineVolume : 1.5f;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                //", productionCountry='" + productionCountry + '\'' +
                //", color='" + color + '\'' +
                //", maxSpeed=" + maxSpeed +
                '}';
    }

    public void startMoving() {
        System.out.println("Start moving");
    }

    public void stopMoving() {
        System.out.println("Stop moving");
    }

    //public void refill() {
    //    System.out.println("Можно заправлять бензином или дизелем на заправке");
    //}


}
