package com.frostmaster.musicroutine.userservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Created by Igor_Usachev on 3/6/2017.
 */
@SpringBootApplication
@EntityScan(basePackages = { "com.frostmaster.musicroutine.userservice.domain.model.entity" })
@EnableJpaRepositories(basePackages = { "com.frostmaster.musicroutine.userservice.domain.repository" })
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

}
