package com.jiayun.demowebsocket.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.web.servlet.context.ServletWebServerInitializedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @author xiaojiang.lxj at 2020-05-02 10:28.
 */
@Component
@Slf4j
public class MyWebListener implements ApplicationListener<ServletWebServerInitializedEvent> {

    @Override
    public void onApplicationEvent(ServletWebServerInitializedEvent event) {
        int serverPort = event.getWebServer().getPort();
        log.info("the web server is listening on port : "+serverPort);
    }
}
