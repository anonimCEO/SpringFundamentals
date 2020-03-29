package model;

import org.springframework.stereotype.Component;


public class Driver {
    private String CarDriverName = "Andrei";
    private String BusDriverName = "Ion";
    private int driverAge = 35;

    public String getCarDriverName() {
        return CarDriverName;
    }

    public void setCarDriverName(String carDriverName) {
        CarDriverName = carDriverName;
    }

    public String getBusDriverName() {
        return BusDriverName;
    }

    public void setBusDriverName(String busDriverName) {
        BusDriverName = busDriverName;
    }

    public int getDriverAge() {
        return driverAge;
    }

    public void setDriverAge(int driverAge) {
        this.driverAge = driverAge;
    }
}
