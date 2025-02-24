package edu.icet.ecom.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Configaration {

    @Bean
    public ModelMapper getModelMapper (){return new ModelMapper();}
}
