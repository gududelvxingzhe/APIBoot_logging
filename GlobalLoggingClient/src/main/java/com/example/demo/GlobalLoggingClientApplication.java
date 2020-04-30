package com.example.demo;

import org.minbox.framework.logging.spring.context.annotation.client.EnableLoggingClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableLoggingClient
@EnableEurekaClient
public class GlobalLoggingClientApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(GlobalLoggingClientApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(GlobalLoggingClientApplication.class, args);
		LOGGER.info("请求服务器启动成功……");
	}

}
