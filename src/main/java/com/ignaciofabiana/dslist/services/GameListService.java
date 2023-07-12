package com.ignaciofabiana.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ignaciofabiana.dslist.dto.GameListDTO;
import com.ignaciofabiana.dslist.entities.GameList;
import com.ignaciofabiana.dslist.repositories.GameListRepository;

@Service
public class GameListService {

    @Autowired // injetando uma instancia de gameRepositpry dentro de GameService
    private GameListRepository gamelistRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll() {
      List<GameList> result = gamelistRepository.findAll();
      List<GameListDTO> dto = result.stream().map(x -> new GameListDTO(x)).toList();
      return dto;
    }

}

