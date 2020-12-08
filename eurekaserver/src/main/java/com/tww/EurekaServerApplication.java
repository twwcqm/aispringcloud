package com.tww;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author 86132
 */
@SpringBootApplication
/**
 *声明该类是一个 Eureka Server 微服务，提供服务注册和服务发现功能，即注册中心。
 */
@EnableEurekaServer
public class EurekaServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication.class,args);
    }
}
