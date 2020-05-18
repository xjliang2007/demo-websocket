package com.jiayun.demowebsocket.runner;

import java.util.Arrays;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author xiaojiang.lxj at 2020-05-16 22:00.
 */
@Component
@Slf4j
@Order(10)
public class MyApplicationRunner implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) {
        log.info("this is application runner : " + Arrays.asList(args.getSourceArgs()));
    }
}
