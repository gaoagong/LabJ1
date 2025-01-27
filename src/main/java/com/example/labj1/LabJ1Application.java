package com.example.labj1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class LabJ1Application {

    public static void main(String[] args) {
        SpringApplication.run(LabJ1Application.class, args);
    }

}
