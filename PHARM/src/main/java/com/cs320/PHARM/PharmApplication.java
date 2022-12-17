package com.cs320.PHARM;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class PharmApplication {

	public static void main(String[] args) {
		SpringApplicationBuilder builder = new SpringApplicationBuilder(PharmApplication.class);
		builder.headless(false);
		ConfigurableApplicationContext context = builder.run(args);
	}

}
