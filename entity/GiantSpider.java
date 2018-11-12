/**
 * ---------------------------------------------------------------------------
 * File name: GiantSpider.java
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
 * Giant spider to attack player
 *
 * <hr>
 * Date created: Nov 11, 2018
 * <hr>
 * @author Carlton Robert
 */
public class GiantSpider extends Participant
{
	private int damage;			//monster damage
	private double accuracy;		//monster hit rate
	/**
	 * 
	 * Default Constructor of GiantSpider   
	 *
	 * <hr>
	 * Date created: Nov 11, 2018 
	 * Last Modified: Nov 11, 2018
	 *
	 *
	 */
	public GiantSpider() 
	{
		super("Giant Spider", 10);
		this.damage = 10;
		this.accuracy = 50;
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
