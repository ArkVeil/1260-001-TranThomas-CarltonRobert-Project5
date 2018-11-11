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
package zork;

import java.util.Random;
import mob.Monster;


/**
 * Hold the map and battles for the zork game
 *
 * <hr>
 * Date created: Nov 11, 2018
 * <hr>
 * @author Carlton Robert
 */
public class DungeonMaster {

	private String map;
	private int mapSize;
	
	/**
	 * 
	 * Constructor        
	 *
	 * <hr>
	 * Date created: Nov 11, 2018 
	 *
	 *
	 */
	public DungeonMaster() {
		// TODO Auto-generated constructor stub
		map = "";
		mapSize = 0;
	}
	
	/**
	 * Holds player combat with enemy         
	 *
	 * <hr>
	 * Date created: Nov 11, 2018
	 *
	 * <hr>
	 * @param player
	 * @param mob
	 */
	public Boolean combat(Player player, Monster mob)
	{
		Random ran = new Random();
		Boolean fighting = true;
		int tempHealthPlayer = player.getHealth ( );
		int tempEnemyHealth = mob.getHealth ( );
		
		while(fighting)
		{
			//enemy takes damage
			if(tempEnemyHealth > 0 && tempHealthPlayer > 0 )
			{
				double chance = (ran.nextDouble ( ));
				if(chance <= mob.getAccuracy ( ))
				{
					tempEnemyHealth = ((mob.getHealth ( ) - player.getWeapon().getDamage ()));
					mob.setHealth (tempEnemyHealth);
				}
			}
			else
			{
				return false;
			}
			//player takes damage
			if(tempEnemyHealth > 0 && tempHealthPlayer > 0)
			{
				double chance = (ran.nextDouble ( ));
				if(chance <= player.getWeapon ( ).getAccuracy ( ))
				{
					tempHealthPlayer = (player.getHealth ( ) - mob.getDamage ( ));
					player.setHealth (tempHealthPlayer);
				}
			}
			else
			{
				return true;
			}
		}
		
		return null;
	}
	
	
	/**
	 * Generates map         
	 *
	 * <hr>
	 * Date created: Nov 11, 2018
	 *
	 * <hr>
	 */
	public void generateMap()
	{
		//code	
	}
	
	/**
	 * Show the map and player location         
	 *
	 * <hr>
	 * Date created: Nov 11, 2018
	 *
	 * <hr>
	 */
	public void displayMap()
	{
		
	}

}
