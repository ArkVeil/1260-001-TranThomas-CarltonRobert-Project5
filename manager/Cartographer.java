/**
 * ---------------------------------------------------------------------------
 * File name: Cartographer.java
 * Project name: 1260-001-TranThomas-CarltonRobert-Project5
 * ---------------------------------------------------------------------------
 * Creator's name and email: Thomas Tran, trantt@etsu.edu
 * Course:  CSCI 1260
 * Creation Date: Nov 11, 2018
 * Last Modified: Nov 11, 2018
 * ---------------------------------------------------------------------------
 */

package manager;

import java.util.Random;

/**
 * Enter type purpose here
 *
 * <hr>
 * Date created: Nov 11, 2018
 * Last Modified: Nov 11, 2018
 * <hr>
 * @author Thomas Tran
 */
public class Cartographer
{
	protected static Room[] dungeonData;			//contains the cell data of the dungeon
	protected static String mapData;					//contains the icons of each room
	protected static int roomCount;
	
	/**
	 * Constructor of Cartographer   
	 *
	 * <hr>
	 * Date created: Nov 11, 2018 
	 * Last Modified: Nov 11, 2018
	 *
	 * 
	 */
	public Cartographer ( )
	{
		mapData = "";
		roomCount = 0;
		
	}

	/**
	 * Show the map and player location         
	 *
	 * <hr>
	 * Date created: Nov 11, 2018
	 *
	 * <hr>
	 */
	public static void displayMap()
	{
		mapData = "";
		for(Room r : dungeonData)
		{
			mapData += r.roomIcon;
		}
		
	}

	/**
	 * Generates rooms and fills dungeonData       
	 *
	 * <hr>
	 * Date created: Nov 11, 2018
	 *
	 * <hr>
	 */
	public static void generateMap()
	{
		Random roomCounter = new Random();
		
		roomCount = roomCounter.nextInt (6) + 5;
		dungeonData = new Room[roomCount];
		
		for(int i = 0; i < roomCount ; i++)
		{
			if(i == 0)
				dungeonData[0] = new Room("START", true);
			else if(i == roomCount-1)
				dungeonData[roomCount-1] = new Room("EXIT", false);
			else
				dungeonData[i] = new Room("PASSAGE", false);
		}
		
	}

}
