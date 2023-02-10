package com.arshad.Springsignupapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class SpringSignupApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSignupApiApplication.class, args);
	}

}
