package com.game.transformers.model;

import java.util.HashMap;
import java.util.Map;

public class Transformer {
	private String name;
	private Map<String, Integer> techspecs = new HashMap<>();
	private String type;
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @return the techspecs
	 */
	public Map<String, Integer> getTechspecs() {
		return techspecs;
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
	 * @param techspecs the techspecs to set
	 */
	public void setTechspecs(Map<String, Integer> techspecs) {
		this.techspecs = techspecs;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
	
	
}
