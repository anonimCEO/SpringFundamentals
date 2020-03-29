package config;

import model.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("model")
public class ConfigClass {

    @Bean
    Driver getCarDriver(){
        return new Driver();
    }

}
