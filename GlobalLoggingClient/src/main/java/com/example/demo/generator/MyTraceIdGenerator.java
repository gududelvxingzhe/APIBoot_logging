package com.example.demo.generator;

import java.util.UUID;

import org.minbox.framework.logging.client.MinBoxLoggingException;
import org.minbox.framework.logging.client.tracer.LoggingTraceGenerator;

/**
 * 
 *
 * Title: MyTraceIdGenerator
 *
 * Description: 自定义traceId生成策略
 *
 * @author Mr XinFei Zhou
 *
 * @date 2020年4月30日
 *
 */
public class MyTraceIdGenerator implements LoggingTraceGenerator {

    /**
     * 链路编号前缀
     */
    private static final String TRACE_ID_PREFIX = "local";
    
    @Override
    public String createTraceId() throws MinBoxLoggingException {
        return TRACE_ID_PREFIX + UUID.randomUUID().toString().hashCode();
    }
}
