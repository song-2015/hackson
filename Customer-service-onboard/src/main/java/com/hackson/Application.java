package com.hackson;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.context.ApplicationPidFileWriter;

/**
 * Created by song on 2023/9/21.
 */
public class Application {

    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(Application.class);
        springApplication.addListeners(new ApplicationPidFileWriter());
        springApplication.run(args);
    }
}
