package com.devv7.dslist.services;

import com.devv7.dslist.dtos.GameDTO;
import com.devv7.dslist.dtos.GameMinDTO;
import com.devv7.dslist.entities.Game;
import com.devv7.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll() {
        return gameRepository.findAll().stream().map(GameMinDTO::new).toList();
    }

    @Transactional(readOnly = true)
    public GameDTO findById(Long id) {
        return new GameDTO(gameRepository.findById(id).get());
    }
}

