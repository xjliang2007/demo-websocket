package com.jiayun.demowebsocket.component;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

/**
 * @author xiaojiang.lxj at 2020-05-13 21:54.
 */
@Component
@Slf4j
public class AuthorizationImpl {
    public boolean authorize(String token){
        log.info("the authorized token is : "+token);
        return !StringUtils.isEmpty(token);
    }
}
