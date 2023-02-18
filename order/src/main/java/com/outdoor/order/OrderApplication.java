package com.outdoor.order;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class OrderApplication {

    @Bean
    public ModelMapper modelMapper () {
        return new ModelMapper();
    }
    public static void main(String[] args) {
        SpringApplication.run(OrderApplication.class, args);
    }
}
