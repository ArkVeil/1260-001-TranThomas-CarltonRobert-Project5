/**
 * ---------------------------------------------------------------------------
 * File name: BlackSnake.java
 * Project name: 1260-001-TranThomas-CarltonRobert-Project5
 * ---------------------------------------------------------------------------
 * Creator's name and email: Carlton Robert, Carltonr@etsu.edu
 * Course:  CSCI 1260
 * Creation Date: Nov 11, 2018
 * ---------------------------------------------------------------------------
 */
package entity;

/**
 * 
 * Black Snake monster to attack player
 *
 * <hr>
 * Date created: Nov 11, 2018
 * <hr>
 * @author Carlton Robert
 */
public class BlackSnake extends Participant 
{
	private int damage;			//monster damage
	private double accuracy;		//monster hit rate
	
	/**
	 * 
	 * Default Constructor of BlackSnake   
	 *
	 * <hr>
	 * Date created: Nov 11, 2018 
	 * Last Modified: Nov 11, 2018
	 *
	 *
	 */
	public BlackSnake() 
	{
		super("Black Snake", 20);
		this.damage = 35;
		this.accuracy = 55;
	}

	
	/**
	 * @return damage
	 */
	public int getDamage ( )
	{
		return damage;
	}

	
	/**
	 * @return accuracy
	 */
	public double getAccuracy ( )
	{
		return accuracy;
	}

}
