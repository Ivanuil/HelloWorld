package edu.ivanuil.friendalertbot.web.controller;

import edu.ivanuil.friendalertbot.dto.HelloWorldDto;
import edu.ivanuil.friendalertbot.service.HelloWorldService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class HelloWorldController {

    private final HelloWorldService helloWorldService;

    @GetMapping()
    public HelloWorldDto getStatuses() {
        var greeting = helloWorldService.greet();
        return new HelloWorldDto(greeting.getId(), greeting.getMessage());
    }

}
