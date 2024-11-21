package edu.ivanuil.friendalertbot.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.UUID;

@Data
@AllArgsConstructor
public class HelloWorldDto {

    private UUID id;
    private String message;

}
