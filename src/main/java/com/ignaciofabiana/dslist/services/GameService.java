package com.ignaciofabiana.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ignaciofabiana.dslist.dto.GameDTO;
import com.ignaciofabiana.dslist.dto.GameMinDTO;
import com.ignaciofabiana.dslist.entities.Game;
import com.ignaciofabiana.dslist.projection.GameMimProjection;
import com.ignaciofabiana.dslist.repositories.GameRepository;

@Service
public class GameService {

    @Autowired // injetando uma instancia de gameRepositpry dentro de GameService
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll() {
      List<Game> result = gameRepository.findAll();
      List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
      return dto;
    }

    @Transactional(readOnly = true)
    public GameDTO findById(Long id){
      Game result = gameRepository.findById(id).get();
      GameDTO dto = new GameDTO(result);
      return dto;
    }


    @Transactional(readOnly = true)
    public List<GameMinDTO> findByList(Long listId) {
      List<GameMimProjection> result = gameRepository.searchByList(listId);
      List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
      return dto;
    }

    
}
