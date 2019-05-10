package com.game.transformers.service;

import com.game.transformers.model.ApplicationResponse;
import com.game.transformers.model.Transformer;
import com.game.transformers.model.TransformerResponse;

public interface GameService {

	public ApplicationResponse createTransformer(Transformer transformer);

	public ApplicationResponse getTransformers();

	

}
