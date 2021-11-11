package com.sparta.myspringsecurity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class MySpringSecurityApplication {

    public static void main(String[] args) {
        SpringApplication.run(MySpringSecurityApplication.class, args);
    }

}
