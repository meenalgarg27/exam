package com.game.transformers.service;

import com.game.transformers.model.Transformer;
import com.game.transformers.model.TransformerResponse;

public interface GameService {

	public TransformerResponse createTransformer(Transformer transformer);

	public TransformerResponse getTransformers();

	

}
