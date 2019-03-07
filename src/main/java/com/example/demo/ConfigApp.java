package com.example.demo;

import com.example.demo.entity.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigApp {

    @Bean
    public String person(){
        return "yes";
    }
}
