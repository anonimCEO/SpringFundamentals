package config;

import model.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("model")
public class ConfigClass {

    @Bean
    Car getCar(){
        Car car = new Car();
        car.setCarDriver(getCarDriver());
        return car;
    }

    @Bean
    Driver getCarDriver(){
        return new Driver();
    }

    @Bean
    Bus getBus(){
        Bus bus = new Bus("Ikarus",4.5,getCarDriver());
        bus.setBusDriver(getCarDriver());
        return bus;
    }

}
