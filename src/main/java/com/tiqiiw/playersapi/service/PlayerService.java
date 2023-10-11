package com.tiqiiw.playersapi.service;

import com.tiqiiw.playersapi.dto.PlayerDto;
import com.tiqiiw.playersapi.entity.Player;
import com.tiqiiw.playersapi.repository.PlayerRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class PlayerService {

    private final PlayerRepository playerRepository;

    public PlayerService(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    public Player save(PlayerDto playerDto){

        List<Player> players = playerRepository.findByName(playerDto.getName());

        if(players.isEmpty()) {
            Player player = new Player()
                    .setName(playerDto.getName())
                    .setRating(playerDto.getRating())
                    .setId(UUID.randomUUID().toString());

            return playerRepository.save(player);
        }
        else{
            return players.get(0);
        }
    }

    public Iterable<Player> getAll(){
        return playerRepository.findAll();
    }
}
