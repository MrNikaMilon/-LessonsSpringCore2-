package com.springdemo.learnspringvol2;

import com.springdemo.learnspringvol2.entity.Auto;
import com.springdemo.learnspringvol2.entity.Engine;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.springdemo.learnspringvol2")
public class SpringConfig {
    @Bean
    public Auto Mazda(Engine V8) {
        return new Auto(1, "Mazda", V8);
    }

    @Bean
    public Auto Hyundai(Engine V4) {
        return new Auto(2, "Hyundai", V4);
    }

    @Bean
    public Auto Kia(Engine V4) {
        return new Auto(3, "Kia", V4);
    }

    @Bean
    public Auto Mercedes(Engine V4) {
        return new Auto(4, "Mercedes", V4);
    }

    @Bean
    public Engine V8(Engine engine) {
        return new Engine(8, 100);
    }

    @Bean
    public Engine V4(Engine engine) {
        return new Engine(4, 50);
    }
}
