/**
 * ---------------------------------------------------------------------------
 * File name: GiantSpider.java
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
 * Giant spider to attack player
 *
 * <hr>
 * Date created: Nov 11, 2018
 * <hr>
 * @author Carlton Robert
 */
public class GiantSpider extends Monster {

	/**
	 * 
	 * Base Constructor        
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
	public GiantSpider() {

		super();
		name = "Giant Spider";
		this.damage = 10;
		this.health = 10;
		this.accuracy = 0.50;
	}

}
