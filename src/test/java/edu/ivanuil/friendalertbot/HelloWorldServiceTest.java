package edu.ivanuil.friendalertbot;

import edu.ivanuil.friendalertbot.entity.HelloWorldEntity;
import edu.ivanuil.friendalertbot.repository.HelloWorldRepository;
import edu.ivanuil.friendalertbot.service.HelloWorldService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.List;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@EnableAutoConfiguration(exclude = {
        DataSourceAutoConfiguration.class,
        DataSourceTransactionManagerAutoConfiguration.class,
        HibernateJpaAutoConfiguration.class})
public class HelloWorldServiceTest {

    @MockBean
    HelloWorldRepository helloWorldRepository;

    @Autowired private HelloWorldService service;

    @Test
    public void greetingTest() {
        Mockito.when(helloWorldRepository.findAll()).thenReturn(
                List.of(new HelloWorldEntity(UUID.randomUUID(), "Hello World!!!")));

        var greeting = service.greet();

        assertEquals("Hello World!!!" ,greeting.getMessage());
    }

}