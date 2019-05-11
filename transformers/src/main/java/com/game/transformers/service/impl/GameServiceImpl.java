package com.game.transformers.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.game.transformers.constants.TransformersConstants;
import com.game.transformers.entity.TransformerEntity;
import com.game.transformers.model.ApplicationResponse;
import com.game.transformers.model.Link;
import com.game.transformers.model.TechSpecModel;
import com.game.transformers.model.Transformer;
import com.game.transformers.model.TransformerResponse;
import com.game.transformers.repository.GameRepository;
import com.game.transformers.service.GameService;

@Service
public class GameServiceImpl implements GameService {

	private final GameRepository gameRepository;

	public GameServiceImpl(GameRepository gameRepository) {
		super();
		this.gameRepository = gameRepository;
	}

	@Override
	public ApplicationResponse createTransformer(Transformer transformer) {

		TransformerEntity transformerEntity = this.prepareTransformerEntity(transformer);
		ApplicationResponse response = new ApplicationResponse();
		TransformerEntity transformerEntityResponse = this.gameRepository.save(transformerEntity);
		TransformerResponse transformerResponse = new TransformerResponse();
		transformerResponse.setId(transformerEntityResponse.getId());
		List<TransformerResponse> list = new ArrayList<>();
		list.add(transformerResponse);
		response.setData(list);
		List<Link> links = new ArrayList<>();
		links.add(new Link(TransformersConstants.NEXT_LINK, "api_url"));
		response.setLinks(links);
		return response;
	}

	@Override
	public ApplicationResponse getTransformers() {
		ApplicationResponse response = new ApplicationResponse();
		List<TransformerEntity> transformerEntityResponse = this.gameRepository.findAll();
		List<TransformerResponse> transformerList = new ArrayList<>();

		if (transformerEntityResponse != null) {
			for (TransformerEntity transformer : transformerEntityResponse) {
				TransformerResponse respones = this.prepareTransformerResponse(transformer);
				transformerList.add(respones);
			}
		}

		response.setData(transformerList);
		List<Link> links = new ArrayList<>();
		links.add(new Link(TransformersConstants.NEXT_LINK, "api_url"));
		response.setLinks(links);
		return response;
	}

	private TransformerEntity prepareTransformerEntity(Transformer transformer) {
		TransformerEntity transformerEntity = new TransformerEntity();
		transformerEntity.setName(transformer.getName());
		transformerEntity.setType(transformer.getType());
		if (transformer.getTechSpecs() != null) {
			transformerEntity.setCourage(transformer.getTechSpecs().getCourage());
			transformerEntity.setEndurance(transformer.getTechSpecs().getEndurance());
			transformerEntity.setFirepower(transformer.getTechSpecs().getFirepower());
			transformerEntity.setIntelligence(transformer.getTechSpecs().getIntelligence());
			transformerEntity.setRank(transformer.getTechSpecs().getRank());
			transformerEntity.setSkill(transformer.getTechSpecs().getSkill());
			transformerEntity.setSpeed(transformer.getTechSpecs().getSpeed());
			transformerEntity.setStrength(transformer.getTechSpecs().getStrength());
		}
		return transformerEntity;

	}

	private TransformerResponse prepareTransformerResponse(TransformerEntity transformerEntity) {
		TransformerResponse transformerResponse = new TransformerResponse();

		if (transformerEntity != null) {
			transformerResponse.setId(transformerEntity.getId());
			transformerResponse.setName(transformerEntity.getName());
			transformerResponse.setType(transformerEntity.getType());
			TechSpecModel techSpec = new TechSpecModel();
			techSpec.setCourage(transformerEntity.getCourage());
			techSpec.setEndurance(transformerEntity.getEndurance());
			techSpec.setFirepower(transformerEntity.getFirepower());
			techSpec.setIntelligence(transformerEntity.getIntelligence());
			techSpec.setRank(transformerEntity.getRank());
			techSpec.setSkill(transformerEntity.getSkill());
			techSpec.setSpeed(transformerEntity.getSpeed());
			techSpec.setStrength(transformerEntity.getStrength());
			transformerResponse.setTechSpecs(techSpec);
		}
		return transformerResponse;

	}

	/*
	 * private Link createLinks(String url, String type) { Link link = new Link();
	 * link.setName(TransformersConstants.NEXT_LINK); link.setUrl(url); return link;
	 * }
	 */

}
