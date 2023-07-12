package com.ignaciofabiana.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ignaciofabiana.dslist.entities.GameList;

// componente que irá dar acesso ao banco de dados
public interface GameListRepository extends JpaRepository<GameList, Long> {
    
}
