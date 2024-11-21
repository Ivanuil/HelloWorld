package edu.ivanuil.friendalertbot.repository;

import edu.ivanuil.friendalertbot.entity.HelloWorldEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface HelloWorldRepository extends JpaRepository<HelloWorldEntity, UUID> {

}
