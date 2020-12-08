package com.tww;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class restTemplateApplication {
    public static void main(String[] args) {
        SpringApplication.run(restTemplateApplication.class, args);
    }


    /**
     * 注入到IOC容器中
     * @return RestTemplate
     */
    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
