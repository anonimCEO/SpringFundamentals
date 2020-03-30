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
        carBean.getCarDriver().setDriverName("Andrei"); //look here

        System.out.println("Car driver name is: " + carBean.getCarDriver().getDriverName()); //look here
        System.out.println("Car model is: " + carBean.getCarModel());
        System.out.println("Car engine capacity: " + carBean.getCarEngineCapacity());


        Bus busBean = context.getBean(Bus.class);
        busBean.setBusModel("Ikarus");
        busBean.setBusEngineCapacity(4.2);
        busBean.getBusDriver().setDriverName("Ion");//look here
        System.out.println("Bus driver name is: " + busBean.getBusDriver().getDriverName()); //look here
        System.out.println("Bus model is: " + busBean.getBusModel());
        System.out.println("Bus engine capacity: " + busBean.getBusEngineCapacity());



    }
}
