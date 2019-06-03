package com.songxh.avenger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * starter app
 *
 * @author hexiaosong
 * @date 2019-04-23
 */
@EnableConfigServer
@SpringBootApplication
public class AvengerApp {

    public static void main(String[] args) {
        SpringApplication.run(AvengerApp.class, args);
    }
}
