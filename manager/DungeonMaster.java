/**
 * ---------------------------------------------------------------------------
 * File name: DungeonMaster.java
 * Project name: 1260-001-TranThomas-CarltonRobert-Project5
 * ---------------------------------------------------------------------------
 * Creator's name and email: Carlton Robert, Carltonr@etsu.edu
 * Course:  CSCI 1260
 * Creation Date: Nov 11, 2018
 * ---------------------------------------------------------------------------
 */
package manager;

import java.util.Random;
import entity.*;


/**
 * Hold the map and battles for the zork game
 *
 * <hr>
 * Date created: Nov 11, 2018
 * <hr>
 * @author Carlton Robert
 */
public class DungeonMaster 
{
	protected static boolean dead = false;			//check if player has died
	protected static boolean cleared = false;		//check if dungeon has been cleared
	
	/**
	 * 
	 * Main game play loop; tracks whether the game is still running and initiates combat if needed          
	 *
	 * <hr>
	 * Date created: Nov 11, 2018
	 * Last Modified: Nov 11, 2018
	 *
	 * <hr>
	 */
	public static String checkForWeapon(Player player)
	{
		Random randomEncounter = new Random();	//random generator
		
		String eventLog = "";					//Event output
			
		if(Cartographer.dungeonData[player.getLocation ( )].isExplored ( )==false)
		{
			if(randomEncounter.nextInt(10000) < 2000)
			{
				eventLog = "Weapon";
			}
		}
		return eventLog;
	}
		
	public static String checkForMob(Player player)
		{
			Random randomEncounter = new Random();	//random generator
			
			String eventLog = "";					//Event output
					
			if(Cartographer.dungeonData[player.getLocation ( )].isExplored ( )==false)
			{

				if(randomEncounter.nextInt (10000) < 5000)
				{
					eventLog = "Mob";
				}

			}

		return eventLog;
	}//end runPlayLoop()

	/**
	 * Holds player combat with enemy;       
	 *
	 * <hr>
	 * Date created: Nov 11, 2018
	 *
	 * <hr>
	 * @param player - player entity
	 * @param mob - player's opponent
	 */
	public static String combat(Player player, Monster mob)
	{
		Random ran = new Random();
		Boolean fighting = true;
		String combatLog = "\n";
		int tempPlayerHealth = player.getHealth ( );
		int tempEnemyHealth = mob.getHealth ( );
		int playerDmg =  player.getWeapon ( ).getDamage ( );
		int mobDmg = mob.getDamage ( );
		
		if(player.getHealth ( ) <= 0)
			fighting = false;
		while(fighting)
		{
			//player attacks
			if ( ran.nextInt(10000) < player.getWeapon().getAccuracy() * 10000)
			{
				combatLog += "You hit for " + playerDmg +" damage\n";
				tempEnemyHealth -= playerDmg; 
			}
			else
				combatLog += "You miss!\n";
			
			if(tempEnemyHealth <= 0)
			{
				combatLog += "\nYou have defeated the " + mob.getName ( ) + " with " + tempPlayerHealth + " HP remaining!";
				player.setHealth (tempPlayerHealth);
				break;
			}
			//monster attacks
			if ( ran.nextInt(10000) < mob.getAccuracy ( ) * 10000)
			{
				combatLog += "The " + mob.getName ( ) + " hits you for " + mobDmg +" damage\n";
				tempPlayerHealth -= mobDmg;
			}
			else
				combatLog += "The " + mob.getName ( ) + " misses!\n";
				
			if(tempPlayerHealth <= 0)
			{
				dead = true;
				combatLog = "\tGAME OVER\nYou have died\nProgrammed by Thomas Tran and Robert Carlton";
				fighting = false;
			}
			else if(tempEnemyHealth <= 0)
			{
				combatLog += "\nYou have defeated the " + mob.getName ( ) + " with " + tempPlayerHealth + " HP remaining!";
				player.setHealth (tempPlayerHealth);
				fighting = false;
			}
		}
		return combatLog;
		
	}
	
	public static String move(Player player, int direction)
	{
		String[] movement = {"Left", "Right"};			//Available Movements
		String result = "";								//results of attempted movement;
	
		//determines movement
		switch(direction)
		{
			case 0:
				if(player.getLocation ( ) != 0)
				{
					Cartographer.dungeonData[player.getLocation()].setExplored (true);
					Cartographer.dungeonData[player.getLocation()].setOccupied (false);
					player.move (movement[direction]);
					Cartographer.dungeonData[player.getLocation()].setOccupied (true);
				}
				else
					result = "You can't go that way";
				break;
			case 1:
				if(player.getLocation ( ) < Cartographer.roomCount-1 && player.getLocation ( ) >= 0 )
				{
					Cartographer.dungeonData[player.getLocation()].setExplored (true);
					Cartographer.dungeonData[player.getLocation()].setOccupied (false);
					player.move (movement[direction]);
					Cartographer.dungeonData[player.getLocation()].setOccupied (true);
				}
				else
				{
					result = "You have escaped and completed the dungeon!";
					cleared = true;
				}
				break;
			default:
				result = "Quit";
			
		}//end switch(directionButton)
		
		return result;
	}//end move(Player, int)
	
	
}
