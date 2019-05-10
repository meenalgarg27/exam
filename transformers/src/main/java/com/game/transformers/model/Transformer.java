package com.game.transformers.model;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class Transformer {
	
	@NotNull
	@NotBlank(message = "Name should not be blank")
	private String name;
	@Valid
	private TechSpecModel techSpecs;
	@NotNull
	private String type;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @param type
	 *            the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @return the techSpecs
	 */
	public TechSpecModel getTechSpecs() {
		return techSpecs;
	}

	/**
	 * @param techSpecs
	 *            the techSpecs to set
	 */
	public void setTechSpecs(TechSpecModel techSpecs) {
		this.techSpecs = techSpecs;
	}

}
