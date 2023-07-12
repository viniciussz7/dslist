package com.devv7.dslist.services;

import com.devv7.dslist.dtos.GameMinDTO;
import com.devv7.dslist.entities.Game;
import com.devv7.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findAll() {
        return gameRepository.findAll().stream().map(GameMinDTO::new).toList();
    }
}

