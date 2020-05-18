package com.jiayun.demowebsocket.controller;

import com.jiayun.demowebsocket.annotation.Authorize;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xiaojiang.lxj at 2020-05-01 16:27.
 */
@RestController
@Slf4j
public class PracticeController {

    @RequestMapping(value = "/users/{id}",method = {RequestMethod.GET})
    public Map<String,Object> getUserInfo(@PathVariable Long id){
        log.info("get user info with id = {}",id);
        Map<String,Object> info = new HashMap<>();
        info.put("name","Jack");
        info.put("id",id);
        return info;
    }

    @Authorize
    @PostMapping(path = "/hello")
    public String sayHello(
        HttpServletRequest request
    ){
        String authorizationHeader = request.getHeader("Authorization");
        log.info("say hello with authorization : " + authorizationHeader);
        return "hi, nice to meet you.";
    }
}
