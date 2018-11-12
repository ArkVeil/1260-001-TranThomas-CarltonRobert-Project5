/**
 * ---------------------------------------------------------------------------
 * File name: ZorkDriver.java
 * Project name: 1260-001-TranThomas-CarltonRobert-Project5
 * ---------------------------------------------------------------------------
 * Creator's name and email: Thomas Tran, trantt@etsu.edu
 * Course:  CSCI 1260-001
 * Creation Date: Nov 11, 2018
 * ---------------------------------------------------------------------------
 */
package manager;

import java.util.Random;
import javax.swing.JOptionPane;
import entity.*;
import weapon.*;


/**
 * I/O Class
 *
 * <hr>
 * Date created: Nov 11, 2018
 * <hr>
 * @author Thomas Tran
 */
public class ZorkDriver
{

	/**
	 * Main Driver; Responsible for all I/O      
	 *
	 * <hr>
	 * Date created: Nov 11, 2018
	 *
	 * <hr>
	 * @param args
	 */
	public static void main (String [ ] args)
	{
		Random dice = new Random();							//random number generator
		String[] movement = {"Left", "Right"};				//movement buttons
		String[] quit = {"Yes", "No"};						//quit buttons
		String[] fight = {"Fight", "Roll over and Die"};	//Fight buttons
		String[] weapon = {"Pick Up", "Leave Alone"};		//New Weapon buttons
		
		Weapon[] armory = {	new Stick(),
							new Sword(),
							new Scimitar(),
							new StarCannon()};			//list of available weapons to be found
		
		Participant[] mob = {	new BlackSnake(),
							new GiantSpider(),
							new Slime()};				//list of available monsters
		
		Weapon foundWeapon = null;				//Newly found weapon
		
		int directionButton = 2;				//player movement input
		int playerChoice = 0;					//tracks player choice; generic for weapon and fights
		int quitButton = 0;						//tracks if player wants to quit
		
		String eventLog = "";					//String output of ongoing events
		
		Player player = new Player("Adventurer", 100, new Fist(), 0); //Player Entity
		
		Cartographer.generateMap();

		while(!DungeonMaster.dead && !DungeonMaster.cleared)
		{
			Cartographer.updateMap ( );
			eventLog = Cartographer.mapData+ "\n\n";
			directionButton = JOptionPane.showOptionDialog (null, 
							eventLog, 
							"Where do you want to go",
							JOptionPane.PLAIN_MESSAGE,
							JOptionPane.DEFAULT_OPTION,
							null, 
							movement,
							0);
			eventLog = DungeonMaster.move (player, directionButton);
			
			if(eventLog.equals ("Quit"))
			{
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
						 break;
					 default:
						 JOptionPane.showMessageDialog (null, 
							 	"Goodbye, thank you for playing\nBy Thomas Tran and Robert Carlton",
								":(",
								JOptionPane.PLAIN_MESSAGE);
						 System.exit (-1);
						 break; 
				 }//end switch(quitButton)
			}
			else if (!eventLog.equals (""))
				JOptionPane.showMessageDialog (null, eventLog, null, JOptionPane.PLAIN_MESSAGE);
			
			if(DungeonMaster.cleared == true)
				break;
			
			eventLog = DungeonMaster.checkForWeapon (player);
			if(eventLog.equals("Weapon"))
			{
				foundWeapon = armory[dice.nextInt (armory.length)];
				playerChoice = JOptionPane.showOptionDialog (null, 
								"A " + foundWeapon.getName ( ) + " lies before you.", 
								"You found a weapon!",
								JOptionPane.PLAIN_MESSAGE,
								JOptionPane.DEFAULT_OPTION,
								null, 
								weapon,
								0);
				switch(playerChoice)
				{
					case 0:
						JOptionPane.showMessageDialog (null, 
									"You pick up the " + foundWeapon.getName ( ) + " as your new weapon"
									,null, 
									JOptionPane.PLAIN_MESSAGE);
						player.setWeapon (foundWeapon);
						break;
					case 1:
					default:
						JOptionPane.showMessageDialog (null, 
							"You ignore the " + foundWeapon.getName ( ),
							null, 
							JOptionPane.PLAIN_MESSAGE);
				}
			}
			
			eventLog = DungeonMaster.checkForMob (player);
			
			if(eventLog.equals ("Mob"))
			{
				int mobSpawn = dice.nextInt(mob.length);		//ordinal of mob spawned
				
				eventLog = "A " + mob[mobSpawn].getName ( ) + " stands before you";
				playerChoice = JOptionPane.showOptionDialog (null, 
								eventLog, 
								"A monster found you!",
								JOptionPane.PLAIN_MESSAGE,
								JOptionPane.DEFAULT_OPTION,
								null, 
								fight,
								0);
				switch(playerChoice)
				{
					case 0:
						eventLog = DungeonMaster.combat (player, mob[mobSpawn]);
						break;
					case 1:
						eventLog =  "\tGAME OVER\nYou have died\nProgrammed by Thomas Tran and Robert Carlton";
						JOptionPane.showMessageDialog (null, 
							eventLog
							,null, 
							JOptionPane.PLAIN_MESSAGE);
						System.exit (-1);
						break;
					default:
						eventLog =  "\tGAME OVER\nYou tried to escape but was caught \nProgrammed by Thomas Tran and Robert Carlton";
						JOptionPane.showMessageDialog (null, 
							eventLog
							,null, 
							JOptionPane.PLAIN_MESSAGE);
						System.exit (-1);

				}
				JOptionPane.showMessageDialog (null, 
							eventLog
							,null, 
							JOptionPane.PLAIN_MESSAGE);
				
				if(DungeonMaster.dead==true)
				{
					eventLog =  "\tGAME OVER\nYou have died\nProgrammed by Thomas Tran and Robert Carlton";
					JOptionPane.showMessageDialog (null, 
						eventLog
						,null, 
						JOptionPane.PLAIN_MESSAGE);
					System.exit (-1);
				}
			}
			
		}//end while(alive/dungeon uncleared)
		
		JOptionPane.showMessageDialog (null, 
			" Thanks for playing!\nProgrammed by Thomas Tran and Robert Carlton",
			"CONGRATULATIONS",
			JOptionPane.PLAIN_MESSAGE);
	}

}
