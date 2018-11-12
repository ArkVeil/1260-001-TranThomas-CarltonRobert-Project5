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
public class Monster {
	
	protected String name;
	protected int health;
	protected int damage;
	protected double accuracy;

	/**
	 * 
	 * Constructor        
	 *
	 * <hr>
	 * Date created: Nov 11, 2018 
	 *
	 * 
	 * @param health
	 * @param damage
	 * @param accuracy
	 */
	public Monster()
	{
		this.name = "";
		this.health = 1;
		this.damage = 0;
		this.accuracy = 0.0;
	}//end of Monster()
	
	/**
	 * @return name
	 */
	public String getName ( )
	{
		return name;
	}//end of getName()

	
	/**
	 * @param name the name to set
	 */
	public void setName (String name)
	{
		this.name = name;
	}//end of setName (String name)

	
	/**
	 * @return health
	 */
	public int getHealth ( )
	{
		return health;
	}//end of getHealth()

	
	/**
	 * @param health the health to set
	 */
	public void setHealth (int health)
	{
		this.health = health;
	}//end of setHealth (int health)

	
	/**
	 * @return damage
	 */
	public int getDamage ( )
	{
		return damage;
	}//end of getDamage ( )

	
	/**
	 * @param damage the damage to set
	 */
	public void setDamage (int damage)
	{
		this.damage = damage;
	}//end of setDamage (int damage)

	
	/**
	 * @return accuracy
	 */
	public double getAccuracy ( )
	{
		return accuracy;
	}//end of double getAccuracy ( )

	
	/**
	 * @param accuracy the accuracy to set
	 */
	public void setAccuracy (double accuracy)
	{
		this.accuracy = accuracy;
	}//end of setAccuracy(double accuracy)

}//end of Monster()
