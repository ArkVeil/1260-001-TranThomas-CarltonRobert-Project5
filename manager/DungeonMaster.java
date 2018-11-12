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
import javax.swing.JOptionPane;
import entity.*;
import weapon.*;


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
	protected static boolean dead = false;
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
	public static void runPlayLoop()
	{
		Random randomEncounter = new Random();			//random generator
		boolean gameRun = true;			//tracks if the game is running
		int mobSpawn = 0;					//tracks what mob was spawned
		int directionButton = 2;		//player movement input
		int quitButton = 0;				//tracks if player wants to quit
		
		Weapon[] armory = {	new Fist(),
							new Stick(),
							new Sword(),
							new Scimitar()};		//list of available weapons
		
		Monster[] mob = {	new BlackSnake(),
							new GiantSpider(),
							new Slime()};			//list of available monsters
		
		String[] movement = {"Left", "Right"};		//movement buttons
		String[] quit = {"Yes", "No"};				//quit buttons
		
		Player player = new Player(100, armory[0], 0, "Adventurer");
		
		Cartographer.generateMap();
	
		while(gameRun)
		{
			Cartographer.updateMap (player.getLocation ( ),directionButton);
			directionButton = JOptionPane.showOptionDialog (null, 
											Cartographer.mapData+ "\n\n", 
											"Where do you want to go",
											JOptionPane.PLAIN_MESSAGE,
											JOptionPane.DEFAULT_OPTION,
											null, 
											movement,
											0);
			
			//determines movement
			switch(directionButton)
			{
				case 0:
					if(player.getLocation ( ) != 0)
						player.move (movement[directionButton]);
					else
						JOptionPane.showMessageDialog (null, "You can't go that way", null, JOptionPane.PLAIN_MESSAGE);
					break;
				case 1:
					if(player.getLocation ( ) < Cartographer.roomCount-1)
						player.move (movement[directionButton]);
					else
					{
						JOptionPane.showMessageDialog (null, "You have escaped and completed the dungeon!", null, JOptionPane.PLAIN_MESSAGE);
						gameRun = false;
					}
					break;
				default:
					 quitButton = JOptionPane.showOptionDialog (null, 
						 "Are you sure you want to quit?", 
						null,
						JOptionPane.PLAIN_MESSAGE,
						JOptionPane.DEFAULT_OPTION,
						null, 
						quit,
						0);
					 switch(quitButton)
					 {
						 case 0:
							 JOptionPane.showMessageDialog (null, 
								 	"Goodbye, thank you for playing\nBy Thomas Tran and Robert Carlton",
									":(",
									JOptionPane.PLAIN_MESSAGE);
							 System.exit (-1);
						 case 1:
						 default:
							 break; 
					 }//end switch(quitButton)
			}//end switch(directionButton)
			
			if(Cartographer.dungeonData[player.getLocation ( )].isExplored ( )==false)
			{
				if(randomEncounter.nextInt (10000) < 10000)
				{
					mobSpawn = randomEncounter.nextInt(mob.length);
					System.out.println ("A " + mob[mobSpawn] + " stands before you");
					System.out.print (combat(player, mob[mobSpawn]));
				}//end of if(randomEncounter.nextInt (10000) < 10000)
			}//end of if(Cartographer.dungeonData[player.getLocation ( )].isExplored ( )==false)
			
			
		}//end while(gamerun)
		
	}//end runPlayLoop()

	/**
	 * Holds player combat with enemy;       
	 *
	 * <hr>
	 * Date created: Nov 11, 2018
	 *
	 * <hr>
	 * @param player - player to hold the combat stats
	 * @param mob - holds the combat related stats for whatever monster is up for battle
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
			//end of if( ran.nextInt(10000) < player.getWeapon().getAccuracy() * 10000)
			
			//monster attacks
			if ( ran.nextInt(10000) < mob.getAccuracy ( ) * 10000)
			{
				combatLog += "The " + mob.getName ( ) + " hits you for " + mobDmg +" damage\n";
				tempPlayerHealth -= mobDmg;
			}
			else
				combatLog += "The " + mob.getName ( ) + " misses!\n";
			//end of if	( ran.nextInt(10000) < mob.getAccuracy ( ) * 10000)
			
			if(tempPlayerHealth <= 0)
			{
				dead = true;
				combatLog = "\tGAME OVER\nYou have died";
				fighting = false;
			}//end of if(tempPlayerHealth <= 0)
			else if(tempEnemyHealth <= 0)
			{
				combatLog += "\nYou have defeated the " + mob.getName ( ) + " with " + tempPlayerHealth + " HP remaining!";
				player.setHealth (tempPlayerHealth);
				fighting = false;
			}//end of else if(tempEnemyHealth <= 0)
		}//end of while(fighting)
		
		
		return combatLog;
	}//end of combatPlayer(Player player, Monster mob)
}//end of DungeonMaster()
