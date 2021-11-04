package com.example.elsospring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import java.util.Arrays;

@SpringBootApplication
@EnableConfigurationProperties
//@Configuration
//@EnableAutoConfiguration
//@ComponentScan
public class ElsospringApplication {

    public static void main(String[] args) {
        SpringApplication.run(ElsospringApplication.class, args);
    }

}
