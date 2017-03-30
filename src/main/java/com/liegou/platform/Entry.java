package com.liegou.platform;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * ${DESCRIPTION}
 *
 * @author luckyhua
 * @version 1.0
 * @date 2017/3/29
 */
@SpringBootApplication(scanBasePackages = "com.liegou.platform")
public class Entry {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Entry.class);
    }

}
