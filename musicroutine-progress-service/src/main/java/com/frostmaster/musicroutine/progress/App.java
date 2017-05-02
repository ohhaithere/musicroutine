package com.frostmaster.musicroutine.progress;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Created by Igor_Usachev on 4/25/2017.
 */
@SpringBootApplication
@EntityScan(basePackages = { "com.frostmaster.musicroutine.progress.domain.model" })
@EnableJpaRepositories(basePackages = { "com.frostmaster.musicroutine.progress.domain.repository" })
@EnableEurekaClient
@EnableConfigurationProperties
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

}
