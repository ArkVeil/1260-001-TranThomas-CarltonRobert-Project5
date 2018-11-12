/**
 * ---------------------------------------------------------------------------
 * File name: Participant.java
 * Project name: 1260-001-TranThomas-CarltonRobert-Project5
 * ---------------------------------------------------------------------------
 * Creator's name and email: Thomas Tran, trantt@etsu.edu
 * Course:  CSCI 1260
 * Creation Date: Nov 11, 2018
 * Last Modified: Nov 11, 2018
 * ---------------------------------------------------------------------------
 */

package entity;


/**
 * Super class of all entity objects
 *
 * <hr>
 * Date created: Nov 11, 2018
 * Last Modified: Nov 11, 2018
 * <hr>
 * @author Thomas Tran
 */
public abstract class Participant
{
	protected String name;		//name of Participant
	protected int health;		//Participant health
	
	/**
	 * Default Constructor of Participant   
	 *
	 * <hr>
	 * Date created: Nov 11, 2018 
	 * Last Modified: Nov 11, 2018
	 *
	 * 
	 */
	public Participant ( )
	{
		this.name = "Sandbag";
		this.health = 1000000000;
	}
	
	/**
	 * 
	 * Parameterized Constructor of Participant   
	 *
	 * <hr>
	 * Date created: Nov 11, 2018 
	 * Last Modified: Nov 11, 2018
	 *
	 * 
	 * @param name - Participant name
	 * @param health - Participant health
	 */
	public Participant (String name, int health)
	{
		this.name = name;
		this.health = health;
	}
	
	/**
	 * @return name
	 */
	public String getName ( )
	{
		return name;
	}
	
	/**
	 * @return health
	 */
	public int getHealth ( )
	{
		return health;
	}
	
	/**
	 * @param name the name to set
	 */
	public void setName (String name)
	{
		this.name = name;
	}
	
	/**
	 * @param health the health to set
	 */
	public void setHealth (int health)
	{
		this.health = health;
	}

	/**
	 * @return damage
	 */
	public int getDamage ( )
	{
		return 0;
	}

	
	/**
	 * @return accuracy
	 */
	public double getAccuracy ( )
	{
		return 0;
	}


}
