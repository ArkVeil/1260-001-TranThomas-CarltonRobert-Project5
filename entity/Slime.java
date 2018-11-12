/**
 * ---------------------------------------------------------------------------
 * File name: Slime.java
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
 * Mob slime monster to attack player
 *
 *
 * <hr>
 * Date created: Nov 11, 2018
 * <hr>
 * @author Carlton Robert
 */
public class Slime extends Participant
{

	public int damage;			//monster damage
	public double accuracy;		//monster hit rate
	/**
	 * 
	 * Default Constructor of Slime   
	 *
	 * <hr>
	 * Date created: Nov 11, 2018 
	 * Last Modified: Nov 11, 2018
	 *
	 *
	 */
	public Slime() 
	{
		super("Slime", 50);
		this.damage = 10;
		this.accuracy = 100;
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
