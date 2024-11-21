package edu.ivanuil.friendalertbot.service;

import edu.ivanuil.friendalertbot.entity.HelloWorldEntity;
import edu.ivanuil.friendalertbot.repository.HelloWorldRepository;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class HelloWorldService {

    private final HelloWorldRepository helloWorldRepository;

    public HelloWorldEntity greet() {
        return helloWorldRepository.findAll().getFirst();
    }

    @PostConstruct
    public void init() {
        helloWorldRepository.save(new HelloWorldEntity(UUID.randomUUID(), "Hello World!!!"));
    }

}
