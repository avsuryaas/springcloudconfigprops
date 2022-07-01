package com.example.springcloudconfigserverexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SpringcloudconfigserverexampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudconfigserverexampleApplication.class, args);
	}

}
