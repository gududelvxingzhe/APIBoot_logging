package com.example.demo.generator;

import java.util.UUID;

import org.minbox.framework.logging.client.MinBoxLoggingException;
import org.minbox.framework.logging.client.span.LoggingSpanGenerator;

/**
 * 
 *
 * Title: MySpanIdGenerator
 *
 * Description: 自定义单元编号生成策略
 *
 * @author Mr XinFei Zhou
 *
 * @date 2020年4月30日
 *
 */
public class MySpanIdGenerator implements LoggingSpanGenerator {

    /**
     * 单元编号前缀
     */
    private static final String SPAN_ID_PREFIX = "group";

    @Override
    public String createSpanId() throws MinBoxLoggingException {
        return SPAN_ID_PREFIX + UUID.randomUUID().toString().hashCode();
    }

}
