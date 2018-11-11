/**
 * ---------------------------------------------------------------------------
 * File name: ZorkDriver.java
 * Project name: 1260-001-TranThomas-CarltonRobert-Project5
 * ---------------------------------------------------------------------------
 * Creator's name and email: Carlton Robert, Carltonr@etsu.edu
 * Course:  CSCI 1260
 * Creation Date: Nov 11, 2018
 * ---------------------------------------------------------------------------
 */
package manager;


import entity.*;
import weapon.*;


/**
 * Output the Zork game
 *
 * <hr>
 * Date created: Nov 11, 2018
 * <hr>
 * @author Carlton Robert
 */
public class ZorkDriver
{

	/**
	 * Enter method description here         
	 *
	 * <hr>
	 * Date created: Nov 11, 2018
	 *
	 * <hr>
	 * @param args
	 */
	public static void main (String [ ] args)
	{
		Weapon wpn = new Fist();
		Player player = new Player(100, wpn, 1, "Adventurer");
		Monster mon = new Slime();
		
		DungeonMaster dm = new DungeonMaster();
		// TODO Auto-generated method stub
		boolean bp = dm.combat (player, mon);
		if(bp)
		{
			System.out.println (player.getName() + "\\" + player.getHealth ( ) + "\\" + mon.getHealth ( ));
		}
		else
		{
			System.out.println (mon.getName ( ) + "\\" + mon.getHealth ( ) + "\\" + player.getHealth ( ) + bp);
		}
		
	}

}
