package com.example.demo;

import org.minbox.framework.api.boot.autoconfigure.sequence.ApiBootSequenceContext;
import org.minbox.framework.logging.spring.context.annotation.client.EnableLoggingClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
@EnableLoggingClient
public class GlobalLoggingEurekaApplication implements CommandLineRunner {
	
	
	private static final Logger LOGGER = LoggerFactory.getLogger(GlobalLoggingEurekaApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(GlobalLoggingEurekaApplication.class, args);
		LOGGER.info("eureka启动成功……");
	}

    /**
     * 注入ApiBoot提供的分布式ID生成类
     * <p>
     * 调用{@link ApiBootSequenceContext#nextId()}、{@link ApiBootSequenceContext#nextStringId()}方法可以直接获取ID
     */
    @Autowired
    private ApiBootSequenceContext apiBootSequenceContext;

	@Override
	public void run(String... args) throws Exception {
		//获取下一个String类型的Id
		String stringId = apiBootSequenceContext.nextStringId();
		//获取下一个long类型的Id
		Long nextId = apiBootSequenceContext.nextId();
		System.out.println(stringId+"　，"+nextId);
		
	}
    

}
