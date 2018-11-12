/**
 * ---------------------------------------------------------------------------
 * File name: Slime.java
 * Project name: 1260-001-TranThomas-CarltonRobert-Project5
 * ---------------------------------------------------------------------------
 * Creator's name and email: Carlton Robert, Carltonr@etsu.edu
 * Course:  CSCI 1260
 * Creation Date: Nov 11, 2018
 * ---------------------------------------------------------------------------
 */
package entity;

/**
 * 
 * Mob slime monster to attack player
 *
 *
 * <hr>
 * Date created: Nov 11, 2018
 * <hr>
 * @author Carlton Robert
 */
public class Slime extends Monster {

	/**
	 * 
	 * Constructor        
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
	public Slime() {
		super();
		name = "Slime";
		this.damage = 10;
		this.health = 10;
		this.accuracy = 1;
	}//end of Slime()

}//end of Slime()
