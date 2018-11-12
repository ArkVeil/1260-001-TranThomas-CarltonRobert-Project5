/**
 * ---------------------------------------------------------------------------
 * File name: Player.java
 * Project name: 1260-001-TranThomas-CarltonRobert-Project5
 * ---------------------------------------------------------------------------
 * Creator's name and email: Carlton Robert, Carltonr@etsu.edu
 * Course:  CSCI 1260
 * Creation Date: Nov 11, 2018
 * ---------------------------------------------------------------------------
 */
package entity;

import weapon.*;

/**
 * 
 * The player will hold all stats for game
 *
 * <hr>
 * Date created: Nov 11, 2018
 * <hr>
 * @author Carlton Robert
 */
public class Player extends Participant
{
	private Weapon weapon;		//currently held weapon
	private int location;		//current position

	/**
	 * 
	 *Default Constructor        
	 *
	 * <hr>
	 * Date created: Nov 11, 2018 
	 *
	 *
	 */
	public Player() 
	{
		super();
		this.weapon = new Fist();
		this.location = 0;
	}
	
	
	/**
	 * 
	 * Parameterized Constructor of Player   
	 *
	 * <hr>
	 * Date created: Nov 11, 2018 
	 * Last Modified: Nov 11, 2018
	 *
	 * 
	 * @param name - name of player
	 * @param health - health of player
	 * @param weapon - player's weapon
	 * @param location - player's location
	 */
	public Player(String name, int health, Weapon weapon, int location)
	{
		super(name, health);
		this.weapon = weapon;
		this.location = location;
	}
	
	
	/**
	 * Holds the movement for the player        
	 *
	 * <hr>
	 * Date created: Nov 11, 2018
	 *
	 * <hr>
	 */
	public void move(String direction)
	{
		if(direction.equalsIgnoreCase ("Left"))
			location--;
		else if(direction.equalsIgnoreCase ("Right"))
			location++;
	}

	
	/**
	 * @return weapon
	 */
	public Weapon getWeapon ( )
	{
		return weapon;
	}


	
	/**
	 * @param weapon the weapon to set
	 */
	public void setWeapon (Weapon weapon)
	{
		this.weapon = weapon;
	}


	
	/**
	 * @return location
	 */
	public int getLocation ( )
	{
		return location;
	}


	
	/**
	 * @param location the location to set
	 */
	public void setLocation (int location)
	{
		this.location = location;
	}


}
