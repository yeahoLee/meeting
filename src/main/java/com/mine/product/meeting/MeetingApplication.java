package com.mine.product.meeting;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@ComponentScan(basePackages={"com.mine.product.meeting"})
@ServletComponentScan(basePackages = {"com.mine.product.meeting"})
@EnableScheduling
@EnableJpaAuditing
@ImportResource("classpath:dubbo-consumer.xml")
public class MeetingApplication {

    public static void main(String[] args) {
        System.setProperty("dubbo.application.logger","log4j2");
        SpringApplication.run(MeetingApplication.class, args);
    }

}
