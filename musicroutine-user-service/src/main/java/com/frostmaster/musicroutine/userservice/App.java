package com.frostmaster.musicroutine.userservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Created by Igor_Usachev on 3/6/2017.
 */
@SpringBootApplication
@EnableEurekaClient
@EnableConfigurationProperties
public class App {

    public static void main(String[] args) {
       // Boolean bool = true && false && true;
        SpringApplication.run(App.class, args);
    }

}
