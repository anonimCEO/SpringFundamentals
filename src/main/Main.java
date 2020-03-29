package main;

import config.ConfigClass;
import model.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(ConfigClass.class);

        Car carBean = context.getBean(Car.class);

        carBean.setCarModel("Honda");
        carBean.setCarEngineCapacity(1.8);
        System.out.println("Car driver name is: " + carBean.getCarDriver().getDriverName());
        System.out.println("Car model is: " + carBean.getCarModel());
        System.out.println("Engine capacity: " + carBean.getCarEngineCapacity());




    }
}
