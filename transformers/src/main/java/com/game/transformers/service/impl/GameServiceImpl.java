package com.game.transformers.service.impl;

import org.springframework.stereotype.Service;

import com.game.transformers.model.Transformer;
import com.game.transformers.model.TransformerResponse;
import com.game.transformers.repository.GameRepository;
import com.game.transformers.service.GameService;

@Service
public class GameServiceImpl implements GameService{

	private final GameRepository gameRepository;

	public GameServiceImpl(GameRepository gameRepository) {
		super();
		this.gameRepository = gameRepository;
	}
		
	@Override
	public TransformerResponse createTransformer(Transformer transformer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TransformerResponse getTransformers() {
		// TODO Auto-generated method stub
		return null;
	}

}
