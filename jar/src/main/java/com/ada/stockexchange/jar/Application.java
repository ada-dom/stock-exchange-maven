package com.ada.stockexchange.jar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.ada.stockexchange")
public class Application {

    public static void main(String[] args) {

        SpringApplication.run(Application.class, args);
    }

}
