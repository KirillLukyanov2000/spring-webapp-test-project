package ru.lukyanov.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.Random;

@Configuration
@ComponentScan("ru.lukyanov")
@PropertySource("classpath:myComponentBean.properties")
public class AppConfig {
    @Bean
    public static Random getRandom() {
        return new Random();
    }
}

