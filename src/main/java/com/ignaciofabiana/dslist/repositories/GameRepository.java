package com.ignaciofabiana.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ignaciofabiana.dslist.entities.Game;

// componente que irá dar acesso ao banco de dados
public interface GameRepository extends JpaRepository<Game, Long> {
    
}
