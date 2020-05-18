package com.jiayun.demowebsocket.annotation;

/** @author xiaojiang.lxj at 2020-05-13 21:52. */
public @interface Authorize {
  boolean enabled() default true;
}
