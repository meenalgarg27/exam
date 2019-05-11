package com.game.transformers.model;

public class TransformerResponse {
	
	private Long id;
	
	private String name;
	private TechSpecModel techSpecs;
	private String type;

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the techSpecs
	 */
	public TechSpecModel getTechSpecs() {
		return techSpecs;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @param techSpecs the techSpecs to set
	 */
	public void setTechSpecs(TechSpecModel techSpecs) {
		this.techSpecs = techSpecs;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
	
	
	
}
