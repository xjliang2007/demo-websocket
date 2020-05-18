package com.jiayun.demowebsocket;

import org.springframework.boot.ExitCodeGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/** @author smallriver */
@SpringBootApplication
public class DemoWebsocketApplication {

    @Bean
    public ExitCodeGenerator exitCodeGenerator(){
        return () -> 100;
    }

  public static void main(String[] args) {
    SpringApplication.run(DemoWebsocketApplication.class, args);
  }
}
