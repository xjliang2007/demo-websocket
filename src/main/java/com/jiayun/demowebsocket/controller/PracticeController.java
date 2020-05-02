package com.jiayun.demowebsocket.controller;

import java.util.HashMap;
import java.util.Map;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PathVariable;
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
}
