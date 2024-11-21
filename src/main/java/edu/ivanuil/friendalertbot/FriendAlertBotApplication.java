package edu.ivanuil.friendalertbot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@EnableAsync(proxyTargetClass = true)
public class FriendAlertBotApplication {

    public static void main(final String[] args) {
        SpringApplication.run(FriendAlertBotApplication.class, args);
    }

}
