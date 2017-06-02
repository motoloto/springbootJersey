package com.motoloto.springbootJersey;
 
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication(scanBasePackages={"com.motoloto.springbootJersey"})// same as @Configuration @EnableAutoConfiguration @ComponentScan
public class SpringBootRestApiApp {
 
    public static void main(String[] args) {
        SpringApplication.run(SpringBootRestApiApp.class, args);
    }
}