package com.tiqiiw.playersapi.controllers;

import com.tiqiiw.playersapi.dto.PlayerDto;
import com.tiqiiw.playersapi.entity.Player;
import com.tiqiiw.playersapi.service.PlayerService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/players")
public class PlayerController {

    private final PlayerService playerService;

    public PlayerController(PlayerService playerService) {
        this.playerService = playerService;
    }

    @PostMapping
    public Player save(@RequestBody PlayerDto player){
        return playerService.save(player);
    }

    @GetMapping
    public Iterable<Player> getAll(){
        return playerService.getAll();
    }
}
