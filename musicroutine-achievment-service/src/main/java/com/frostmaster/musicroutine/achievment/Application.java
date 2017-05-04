package com.frostmaster.musicroutine.achievment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Created by Igor_Usachev on 5/4/2017.
 */
@SpringBootApplication
@EntityScan(basePackages = { "com.frostmaster.musicroutine.achievment.domain.model" })
@EnableJpaRepositories(basePackages = { "com.frostmaster.musicroutine.achievment.domain.repository" })
@EnableEurekaClient
@EnableConfigurationProperties
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
