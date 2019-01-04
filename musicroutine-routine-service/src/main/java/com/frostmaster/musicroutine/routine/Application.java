package com.frostmaster.musicroutine.routine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Created by Igor_Usachev on 3/28/2017.
 */
@SpringBootApplication
@EntityScan(basePackages = { "com.frostmaster.musicroutine.routine.domain.model" })
@EnableJpaRepositories(basePackages = { "com.frostmaster.musicroutine.routine.domain.repository" })
@EnableEurekaClient
@EnableConfigurationProperties
@EnableFeignClients
@EnableDiscoveryClient
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
