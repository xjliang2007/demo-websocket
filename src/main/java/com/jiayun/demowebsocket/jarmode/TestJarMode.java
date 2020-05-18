package com.jiayun.demowebsocket.jarmode;

import java.util.Arrays;
import lombok.SneakyThrows;
import org.springframework.boot.loader.jarmode.JarMode;

/**
 * @author xiaojiang.lxj at 2020-05-08 19:05.
 */
public class TestJarMode implements JarMode {

    @Override
    public boolean accepts(String mode) {
        return "test".equals(mode);
    }

    @SneakyThrows
    @Override
    public void run(String mode, String[] args) {
        int loop = 60;
        while(loop-- > 0){
            System.out.println("running in " + mode + " jar mode " + Arrays.asList(args));
            Thread.sleep(1000);
        }
    }
}
