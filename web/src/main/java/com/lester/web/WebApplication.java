package com.lester.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.lester")
public class WebApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebApplication.class, args);
//				new SpringApplicationBuilder()
//				.bannerMode(Banner.Mode.CONSOLE)
//				.sources(WebApplication.class, CoreApplication.class)
//				.run(args);
    }
}
