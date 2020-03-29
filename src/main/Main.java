package main;

import config.ConfigClass;
import model.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(ConfigClass.class);

        Driver driverBean = context.getBean(Driver.class);
        driverBean.setDriverName("Gicu");

        Car carBean = context.getBean(Car.class);
        System.out.println("Driver name is set to: " + carBean.getCarDriver().getDriverName());


        Bus busBean = context.getBean(Bus.class);

        System.out.println("Car driver name: " + busBean.getBusDriver().getDriverName());
        System.out.println("Bus engine capacity: " + busBean.getBusEngineCapacity());
        System.out.println("Bus driver name: " + driverBean.getDriverName());
        System.out.println("Driver Age: " + busBean.getBusDriver().getDriverAge());
    }
}
