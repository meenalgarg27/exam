package com.game.transformers.service.impl;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.game.transformers.entity.TransformerEntity;
import com.game.transformers.model.ApplicationResponse;
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
	public ApplicationResponse createTransformer(Transformer transformer) {

		TransformerEntity transformerEntity = new TransformerEntity();
		BeanUtils.copyProperties(transformerEntity, transformer);
//		BeanUtils.copyProperties(transformerEntity, transformer.getTechSpecs());
		
		ApplicationResponse response = new ApplicationResponse();
		TransformerEntity transformerEntityResponse = this.gameRepository.save(transformerEntity);
		TransformerResponse transformerResponse = new TransformerResponse();
		transformerResponse.setId(transformerEntityResponse.getId());
		response.setData(transformerResponse);
		return response;
	}

	@Override
	public ApplicationResponse getTransformers() {
		ApplicationResponse response = new ApplicationResponse();
		List<TransformerEntity> transformerEntityResponse = this.gameRepository.findAll();
		TransformerResponse transformerResponse = new TransformerResponse();
//		transformerResponse.setId(transformerEntityResponse.getId());
		response.setData(transformerResponse);
		return null;
	}

}
