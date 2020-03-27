package com.tedrain.learning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LearningApplication {

    public static void main(String[] args) {
        System.out.println("Hello,Springboot.");
        SpringApplication.run(LearningApplication.class, args);
    }

}
