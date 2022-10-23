public class Driver <A extends Transport> {

    private String fullName;
    private String typeOfDriverLicense;
    private int yearsOfExperience;
    private A car;



    public Driver(String fullName, String typeOfDriverLicense, int yearsOfExperience, A car) {
        setFullName(fullName);
        setTypeOfDriverLicense(typeOfDriverLicense);
        setYearsOfExperience(yearsOfExperience);
        this.car = car;
    }

    public String getTypeOfDriverLicense() {
        return typeOfDriverLicense;
    }

    public void setTypeOfDriverLicense(String typeOfDriverLicense) {
        this.typeOfDriverLicense = ValidationUtils.validOrDefault(typeOfDriverLicense, "B");
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = ValidationUtils.validOrDefault(fullName, "Ivanov Ivan Ivanovich");
    }


    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = Math.max(yearsOfExperience, 0);
    }

    public A getCar() {
        return car;
    }

    public void startMoving() {
        System.out.println("Начал движение");
    }

    public void stopped() {
        System.out.println(" Остановился");
    }

    public void refillVehicle() {
        System.out.println("Заправил " + this.getCar().getBrand() + this.getCar().getModel());
    }

    //@Override
    //public String toString() {
    //    return "Водитель " + fullName + " управляет автомобилем " + this.car.getBrand() + this.car.getModel() + " и будет участвовать в заезде";
    //}
}