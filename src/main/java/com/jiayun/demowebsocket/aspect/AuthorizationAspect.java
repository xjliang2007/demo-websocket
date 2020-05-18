package com.jiayun.demowebsocket.aspect;

import com.jiayun.demowebsocket.component.AuthorizationImpl;
import javax.servlet.http.HttpServletRequest;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

/**
 * @author xiaojiang.lxj at 2020-05-13 21:58.
 */
@Configuration
@Aspect
public class AuthorizationAspect {

    @Autowired
    private AuthorizationImpl authorization;

    @Before("@annotation(com.jiayun.demowebsocket.annotation.Authorize) && args(httpServletRequest,..)")
    public void before(HttpServletRequest httpServletRequest){
        if (httpServletRequest == null) {
            throw new RuntimeException("request is null");
        }

        if(authorization.authorize(httpServletRequest.getHeader("Authorization"))){
            httpServletRequest.setAttribute(
                "userSession",
                "session information which cann be acces in controller"
            );
        }else {
            throw new RuntimeException("auth error..!!!");
        }
    }
}
