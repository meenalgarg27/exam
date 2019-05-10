package com.game.transformers.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class TransformerEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "TRANSFORMER_ID")
	private long id;

	@Column(name = "TRANSFORMER_NAME")
	private String name;

	@Column
	private int strength;

	@Column
	private int intelligence;

	@Column
	private int speed;
	@Column
	private int endurance;
	@Column
	private int rank;
	@Column
	private int courage;
	@Column
	private int firepower;
	@Column
	private int skill;

	@Column(name = "TRANSFORMER_TYPE")
	private String type;

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the strength
	 */
	public int getStrength() {
		return strength;
	}

	/**
	 * @return the intelligence
	 */
	public int getIntelligence() {
		return intelligence;
	}

	/**
	 * @return the speed
	 */
	public int getSpeed() {
		return speed;
	}

	/**
	 * @return the endurance
	 */
	public int getEndurance() {
		return endurance;
	}

	/**
	 * @return the rank
	 */
	public int getRank() {
		return rank;
	}

	/**
	 * @return the courage
	 */
	public int getCourage() {
		return courage;
	}

	/**
	 * @return the firepower
	 */
	public int getFirepower() {
		return firepower;
	}

	/**
	 * @return the skill
	 */
	public int getSkill() {
		return skill;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @param strength
	 *            the strength to set
	 */
	public void setStrength(int strength) {
		this.strength = strength;
	}

	/**
	 * @param intelligence
	 *            the intelligence to set
	 */
	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}

	/**
	 * @param speed
	 *            the speed to set
	 */
	public void setSpeed(int speed) {
		this.speed = speed;
	}

	/**
	 * @param endurance
	 *            the endurance to set
	 */
	public void setEndurance(int endurance) {
		this.endurance = endurance;
	}

	/**
	 * @param rank
	 *            the rank to set
	 */
	public void setRank(int rank) {
		this.rank = rank;
	}

	/**
	 * @param courage
	 *            the courage to set
	 */
	public void setCourage(int courage) {
		this.courage = courage;
	}

	/**
	 * @param firepower
	 *            the firepower to set
	 */
	public void setFirepower(int firepower) {
		this.firepower = firepower;
	}

	/**
	 * @param skill
	 *            the skill to set
	 */
	public void setSkill(int skill) {
		this.skill = skill;
	}

	/**
	 * @param type
	 *            the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

}
