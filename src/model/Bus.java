package model;

public class Bus implements Transport {
    private String busModel;
    private double busEngineCapacity;
    private Driver busDriver;

    public Bus(String busModel, double busEngineCapacity, Driver busDriver) {
        this.busModel = busModel;
        this.busEngineCapacity = busEngineCapacity;
        this.busDriver = busDriver;
    }

    public String getBusModel() {
        return busModel;
    }

    public void setBusModel(String busModel) {
        this.busModel = busModel;
    }

    public double getBusEngineCapacity() {
        return busEngineCapacity;
    }

    public void setBusEngineCapacity(double busEngineCapacity) {
        this.busEngineCapacity = busEngineCapacity;
    }

    public Driver getBusDriver() {
        return busDriver;
    }

    public void setBusDriver(Driver busDriver) {
        this.busDriver = busDriver;
    }
}
