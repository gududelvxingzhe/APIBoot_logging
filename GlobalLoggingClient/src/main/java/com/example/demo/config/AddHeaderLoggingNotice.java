package com.example.demo.config;

import org.minbox.framework.logging.client.notice.LoggingNotice;
import org.minbox.framework.logging.core.MinBoxLog;
import org.springframework.stereotype.Component;

/**
 * 通过{@link LoggingNotice}向日志的请求header内添加区域信息
 *
 * @author 恒宇少年
 */
@Component
public class AddHeaderLoggingNotice implements LoggingNotice {
    /**
     * 区域头信息key
     */
    private static final String SERVER_REGION = "server-region";

    @Override
    public void notice(MinBoxLog minBoxLog) {
        minBoxLog.getRequestHeaders().put(SERVER_REGION, "上海");
    }

    /**
     * 最大优先级
     *
     * @return
     */
    @Override
    public int getOrder() {
        return HIGHEST_PRECEDENCE;
    }
}