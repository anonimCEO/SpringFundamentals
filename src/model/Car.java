package model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class Car implements Transport{
    @Autowired
    private Driver carDriver;
    private String carModel;
    private double carEngineCapacity;

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
