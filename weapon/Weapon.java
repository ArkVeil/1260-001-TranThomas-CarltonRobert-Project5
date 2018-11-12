/**
 * ---------------------------------------------------------------------------
 * File name: Weapon.java
 * Project name: 1260-001-TranThomas-CarltonRobert-Project5
 * ---------------------------------------------------------------------------
 * Creator's name and email: Carlton Robert, Carltonr@etsu.edu
 * Course:  CSCI 1260
 * Creation Date: Nov 11, 2018
 * ---------------------------------------------------------------------------
 */
package weapon;

/**
 * 
 * Super class for all weapon objects
 *
 * <hr>
 * Date created: Nov 11, 2018
 * <hr>
 * @author Carlton Robert
 */
public abstract class Weapon {
    
    protected String name;				//name of weapon
    protected int damage;				//weapon's damage
    protected double accuracy;			//hit rate of weapon

    /**
     * 
     * Default Constructor        
     *
     * <hr>
     * Date created: Nov 11, 2018 
     *
     *
     */
    public Weapon() 
    {
        this.name = "Fist";
        this.damage = 1;
        this.accuracy = 100;
    }

    /**
     * 
     * Parameterized Constructor of Weapon   
     *
     * <hr>
     * Date created: Nov 11, 2018 
     * Last Modified: Nov 11, 2018
     *
     * 
     * @param name - name of weapon
     * @param damage - damage of weapon
     * @param accuracy - hit rate of weapon
     */
    public Weapon(String name, int damage, double accuracy)
    {
        this.name = name;
        this.damage = damage;
        this.accuracy = accuracy;
    }
    
    /**
     * @return damage
     */
    public int getDamage ( )
    {
        return damage;
    }

    
    /**
     * @return name
     */
    public String getName ( )
    {
        return name;
    }

    
    /**
     * @return accuracy
     */
    public double getAccuracy ( )
    {
        return accuracy;
    }


}