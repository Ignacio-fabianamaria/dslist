package com.ignaciofabiana.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ignaciofabiana.dslist.entities.Game;
import com.ignaciofabiana.dslist.repositories.GameRepository;

@Service
public class GameService {

    @Autowired // injetando uma instancia de gameRepositpry dentro de GameService
    private GameRepository gameRepository;

    public List<Game> findAll() {
      List<Game> result = gameRepository.findAll();
      return result;
    }
}
