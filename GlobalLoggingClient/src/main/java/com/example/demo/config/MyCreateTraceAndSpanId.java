package com.example.demo.config;

import org.minbox.framework.api.boot.autoconfigure.logging.LoggingFactoryBeanCustomizer;
import org.minbox.framework.logging.client.LoggingFactoryBean;
import org.springframework.stereotype.Component;

import com.example.demo.generator.MySpanIdGenerator;
import com.example.demo.generator.MyTraceIdGenerator;

/**
 * 
 *
 * Title: MyCreateTraceAndSpanId
 *
 * Description: 自定义创建链路以及单元编号
 *
 * @author Mr XinFei Zhou
 *
 * @date 2020年4月30日
 *
 */
@Component
public class MyCreateTraceAndSpanId implements LoggingFactoryBeanCustomizer {

	@Override
	public void customize(LoggingFactoryBean factoryBean) {

		MyTraceIdGenerator traceGenerator = new MyTraceIdGenerator();
		factoryBean.setTraceGenerator(traceGenerator);
		MySpanIdGenerator spanGenerator = new MySpanIdGenerator();
		factoryBean.setSpanGenerator(spanGenerator);
		
	}

}
