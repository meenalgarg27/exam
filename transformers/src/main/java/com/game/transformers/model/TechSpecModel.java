package com.game.transformers.model;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

public class TechSpecModel {

	// @Pattern(regexp="^[1-10]",message="length must be 3")
	@Min(1)
	@Max(10)
	private int strength;
	@Min(1)
	@Max(10)
	private int intelligence;
	private int speed;
	private int endurance;
	private int rank;
	private int courage;
	private int firepower;
	private int skill;

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

}
