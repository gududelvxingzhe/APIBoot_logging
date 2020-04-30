package com.example.demo;

import org.minbox.framework.logging.spring.context.annotation.admin.EnableLoggingAdmin;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableLoggingAdmin
public class GlobalLoggingServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(GlobalLoggingServerApplication.class, args);
	}

}
