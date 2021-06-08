package com.mine.product.meeting.config;

import org.jboss.netty.util.internal.StringUtil;
import org.springframework.data.domain.AuditorAware;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.util.Optional;

/**
 * @author ：Yeaho_Lee
 * @date ：Created in 2021/6/7 21:49
 * @description：
 * @modified By：
 * @version: $
 */
@Component
public class UserAuditorAware implements AuditorAware<String> {
    @Override
    public Optional<String> getCurrentAuditor() {
        String userId = "1111";
        if(null != userId) {
            return Optional.of(userId);
        }
        return Optional.empty();
    }
}
