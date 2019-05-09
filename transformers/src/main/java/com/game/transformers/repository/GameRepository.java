package com.game.transformers.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.game.transformers.entity.Transformer;

@Repository
public interface GameRepository extends JpaRepository<Transformer, Long>{

}
