package com.ruoxu.nekonekoko;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class NekonekokoApplication {

    public static void main(String[] args) {
        SpringApplication.run(NekonekokoApplication.class, args);
    }

}
