package com.game.transformers.model;

import java.util.List;

public class TransformerResponse {

	private List<Link> links;
	private Data data;
	private ApiError error;

	/**
	 * @return the links
	 */
	public List<Link> getLinks() {
		return links;
	}

	/**
	 * @return the data
	 */
	public Data getData() {
		return data;
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
	 * @param data
	 *            the data to set
	 */
	public void setData(Data data) {
		this.data = data;
	}

	/**
	 * @param error
	 *            the error to set
	 */
	public void setError(ApiError error) {
		this.error = error;
	}

}
