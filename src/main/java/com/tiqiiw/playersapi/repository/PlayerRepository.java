package com.tiqiiw.playersapi.repository;

import com.tiqiiw.playersapi.entity.Player;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PlayerRepository extends JpaRepository<Player, String> {
    List<Player> findByName(String name);
}
