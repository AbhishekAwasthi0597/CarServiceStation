public abstract class Car {
    private String carType;

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public Car(String carType) {
        this.carType = carType;
    }

    public abstract double getServiceCost(String serviceCode);
}
