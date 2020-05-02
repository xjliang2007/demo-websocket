package com.jiayun.demowebsocket.model;

import lombok.Data;

/**
 * @author xiaojiang.lxj at 2020-04-30 17:42.
 */
@Data
public class Greeting {
    private String content;

    public Greeting() {
    }

    public Greeting(String content) {
        this.content = content;
    }
}
