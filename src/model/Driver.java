package model;

import org.springframework.stereotype.Component;


public class Driver {
    private String CarDriverName = "Andrei";
    private String BusDriverName = "Ion";
    private int driverAge = 35;

    public int getDriverAge() {
        return driverAge;
    }

    public void setDriverAge(int driverAge) {
        this.driverAge = driverAge;
    }
}
