/**
 * ---------------------------------------------------------------------------
 * File name: BlackSnake.java
 * Project name: 1260-001-TranThomas-CarltonRobert-Project5
 * ---------------------------------------------------------------------------
 * Creator's name and email: Carlton Robert, Carltonr@etsu.edu
 * Course:  CSCI 1260
 * Creation Date: Nov 11, 2018
 * ---------------------------------------------------------------------------
 */
package mob;

/**
 * 
 * Black Snake monster to attack player
 *
 * <hr>
 * Date created: Nov 11, 2018
 * <hr>
 * @author Carlton Robert
 */
public class BlackSnake extends Monster 
{


	
	
	/**
	 *Base Constructor        
	 *
	 * <hr>
	 * Date created: Nov 11, 2018 
	 *
	 * 
	 * @param health
	 * @param damage
	 * @param accuracy
	 * @param name
	 */
	public BlackSnake() {

		super();
		name = "Black Snake";
		this.damage = 10;
		this.health = 10;
		this.accuracy = 0.25;
	}

}