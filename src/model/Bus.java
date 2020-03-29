package model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component

public class Bus implements Transport {
    @Autowired
    @Qualifier("Bus")
    private Driver busDriver;
    private double busEngineCapacity;
    private String busModel;

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
