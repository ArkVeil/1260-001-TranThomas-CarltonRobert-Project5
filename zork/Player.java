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
package zork;

import weapon.Weapon;

/**
 * 
 * The player will hold all stats for game
 *
 * <hr>
 * Date created: Nov 11, 2018
 * <hr>
 * @author Carlton Robert
 */
public class Player {
	
	private String name;
	private int health;
	private Weapon weapon;
	private int location;

	/**
	 * 
	 *Base Constructor        
	 *
	 * <hr>
	 * Date created: Nov 11, 2018 
	 *
	 *
	 */
	public Player() {
		// TODO Auto-generated constructor stub
		health = 100;
		weapon = new Weapon();
		location = 1;
		name = "Adventurer";
	}
	
	
	/**
	 *Copy Constructor        
	 *
	 * <hr>
	 * Date created: Nov 11, 2018 
	 *
	 * 
	 * @param health
	 * @param weapon
	 * @param location
	 */
	public Player(int health, Weapon weapon, int location, String name)
	{
		this.health = health;
		this.weapon = weapon;
		this.location = location;
		this.name = name;
	}
	
	
	/**
	 * Holds what weapon is held         
	 *
	 * <hr>
	 * Date created: Nov 11, 2018
	 *
	 * <hr>
	 * @param newWeapon
	 */
	public void pickUpWeapon(Weapon newWeapon)
	{
		//Code for picking up weapon
	}
	
	/**
	 * Holds the movement for the player        
	 *
	 * <hr>
	 * Date created: Nov 11, 2018
	 *
	 * <hr>
	 * @param direction
	 * @param mapSize
	 */
	public void move(String direction, int mapSize)
	{
		//code for moving
	}


	
	/**
	 * @return health
	 */
	public int getHealth ( )
	{
		return health;
	}


	
	/**
	 * @param health the health to set
	 */
	public void setHealth (int health)
	{
		this.health = health;
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
	
	public String getName()
	{
		return name;
	}

}
