package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author km185223
 */
@SpringBootApplication
public class Demo {
    private Demo(){}
    public static void main(String[] args) {

        SpringApplication.run(Demo.class, args);
    }
}
