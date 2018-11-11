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
	public Player(int health, Weapon weapon, int location)
	{
		this.health = health;
		this.weapon = weapon;
		this.location = location;
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

}
