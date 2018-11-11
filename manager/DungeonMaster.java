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

import entity.Monster;
import entity.Player;


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
	public void combat(Player player, Monster mob)
	{
		///combat code;
	}

}
