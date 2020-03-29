package model;

public class Car implements Transport{
    private String carModel;
    private double carEngineCapacity;
    private Driver carDriver;

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public double getCarEngineCapacity() {
        return carEngineCapacity;
    }

    public void setCarEngineCapacity(double carEngineCapacity) {
        this.carEngineCapacity = carEngineCapacity;
    }

    public Driver getCarDriver() {
        return carDriver;
    }

    public void setCarDriver(Driver carDriver) {
        this.carDriver = carDriver;
    }
}
