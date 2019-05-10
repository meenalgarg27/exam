package com.game.transformers.model;

import javax.validation.Valid;

public class TransformerRequest {
	@Valid
	private Transformer transformer;

	/**
	 * @return the transformer
	 */
	public Transformer getTransformer() {
		return transformer;
	}

	/**
	 * @param transformer
	 *            the transformer to set
	 */
	public void setTransformer(Transformer transformer) {
		this.transformer = transformer;
	}

}
