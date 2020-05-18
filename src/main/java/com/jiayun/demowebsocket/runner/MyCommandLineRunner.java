package com.jiayun.demowebsocket.runner;

import java.util.Arrays;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/** @author xiaojiang.lxj at 2020-05-16 22:07. */
@Slf4j
@Component
@Order(5)
public class MyCommandLineRunner implements CommandLineRunner {

  @Override
  public void run(String... args) {
    log.info("this is commandLine runner : " + Arrays.asList(args));
  }
}
