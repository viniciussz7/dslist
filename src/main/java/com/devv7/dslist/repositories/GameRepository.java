package com.devv7.dslist.repositories;

import com.devv7.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long>  {
}
