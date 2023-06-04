package com.example.demos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemosApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context =  SpringApplication.run(DemosApplication.class, args);
        SampleDemo a = context.getBean(SampleDemo.class);
        a.show();

        SampleDemo a1 = context.getBean(SampleDemo.class);
        a1.show();
    }

}
