package edu.ivanuil.friendalertbot;

import edu.ivanuil.friendalertbot.service.HelloWorldService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest()
public class HelloWorldServiceTest {

    @Autowired private HelloWorldService service;

    @Test
    public void greetingTest() {
        var greeting = service.greet();

        assertEquals("Hello World!!!" ,greeting.getMessage());
    }

}