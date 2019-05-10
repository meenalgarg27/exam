package com.game.transformers.model;

import java.util.List;

public class ApplicationResponse {

	private List<Link> links;
	private TransformerResponse data;
	private ApiError error;

	/**
	 * @return the links
	 */
	public List<Link> getLinks() {
		return links;
	}


	/**
	 * @return the error
	 */
	public ApiError getError() {
		return error;
	}

	/**
	 * @param links
	 *            the links to set
	 */
	public void setLinks(List<Link> links) {
		this.links = links;
	}


	/**
	 * @param error
	 *            the error to set
	 */
	public void setError(ApiError error) {
		this.error = error;
	}


	/**
	 * @return the data
	 */
	public TransformerResponse getData() {
		return data;
	}


	/**
	 * @param data the data to set
	 */
	public void setData(TransformerResponse data) {
		this.data = data;
	}

}
