package com.frostmaster.musicroutine.config;

/**
 * Created by Igor_Usachev on 3/22/2017.
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigServiceApp {

    public static void main(String[] args) {
        SpringApplication.run(ConfigServiceApp.class, args);
    }

}
