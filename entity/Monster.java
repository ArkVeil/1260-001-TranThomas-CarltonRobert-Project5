/**
 * ---------------------------------------------------------------------------
 * File name: Monster.java
 * Project name: 1260-001-TranThomas-CarltonRobert-Project5
 * ---------------------------------------------------------------------------
 * Creator's name and email: Carlton Robert, Carltonr@etsu.edu
 * Course:  CSCI 1260
 * Creation Date: Nov 11, 2018
 * ---------------------------------------------------------------------------
 */package entity;

/**
 * 
 * Super class for all monsters
 *
 * <hr>
 * Date created: Nov 11, 2018
 * <hr>
 * @author Carlton Robert
 */
public class Monster extends Participant
{
	
	public int damage;
	public double accuracy;

	/**
	 * 
	 * Default Constructor of Monster   
	 *
	 * <hr>
	 * Date created: Nov 11, 2018 
	 * Last Modified: Nov 11, 2018
	 *
	 *
	 */
	public Monster()
	{
		super();
		this.damage = 0;
		this.accuracy = 0.0;
	}
	
	/**
	 * 
	 * Parameterized Constructor of Monster   
	 *
	 * <hr>
	 * Date created: Nov 11, 2018 
	 * Last Modified: Nov 11, 2018
	 *
	 * 
	 * @param name - monster's name
	 * @param health - monster's health
	 * @param damage - monster's damage
	 * @param accuracy - monster's accuracy
	 */
	public Monster(String name, int health, int damage, double accuracy)
	{
		super(name, health);
		this.damage = 0;
		this.accuracy = 0.00;
	}
	/**
	 * @return damage
	 */
	public int getDamage ( )
	{
		return damage;
	}

	
	/**
	 * @param damage the damage to set
	 */
	public void setDamage (int damage)
	{
		this.damage = damage;
	}

	
	/**
	 * @return accuracy
	 */
	public double getAccuracy ( )
	{
		return accuracy;
	}

	
	/**
	 * @param accuracy the accuracy to set
	 */
	public void setAccuracy (double accuracy)
	{
		this.accuracy = accuracy;
	}

}
