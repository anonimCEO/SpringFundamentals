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
        System.out.println("Car driver name is: " + carBean.getCarDriver().getCarDriverName());
        System.out.println("Car model is: " + carBean.getCarModel());
        System.out.println("Car engine capacity: " + carBean.getCarEngineCapacity());


        Bus busBean = context.getBean(Bus.class);
        busBean.setBusModel("Ikarus");
        busBean.setBusEngineCapacity(4.2);
        System.out.println("---------------------------------");
        System.out.println("Bus driver name is: " + busBean.getBusDriver().getBusDriverName());
        System.out.println("Bus model is: " + busBean.getBusModel());
        System.out.println("Bus engine capacity: " + busBean.getBusEngineCapacity());



    }
}
