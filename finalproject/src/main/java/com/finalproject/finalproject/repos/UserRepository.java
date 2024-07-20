package com.finalproject.finalproject.repos;

import com.finalproject.finalproject.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.yaml.snakeyaml.events.Event;

public interface UserRepository extends JpaRepository<User, Long> {

}
