package com.game.transformers.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class ApplicationResponse {

	private List<Link> links;
	private List<TransformerResponse> data;
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
	public List<TransformerResponse> getData() {
		return data;
	}


	/**
	 * @param data the data to set
	 */
	public void setData(List<TransformerResponse> data) {
		this.data = data;
	}


}
