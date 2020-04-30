package com.example.demo;

import org.minbox.framework.logging.spring.context.annotation.client.EnableLoggingClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
@EnableLoggingClient
public class GlobalLoggingEurekaApplication {
	
	
	private static final Logger LOGGER = LoggerFactory.getLogger(GlobalLoggingEurekaApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(GlobalLoggingEurekaApplication.class, args);
		LOGGER.info("eureka启动成功……");
	}

}
