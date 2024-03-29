package com.stackroute.springBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
@EnableAutoConfiguration
@ComponentScan
public class MuzixAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(MuzixAppApplication.class,args);
	}

}
