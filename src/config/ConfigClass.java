package config;

import model.*;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("model")
public class ConfigClass {

    @Bean
    @Qualifier("Car")
    Driver getCarDriver(){
        return new Driver();
    }

    @Bean
    @Qualifier("Bus")
    Driver getBusDriver(){
        return new Driver();
    }

}
