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
public class Weapon {
    
    protected String name;
    protected int damage;
    protected double accuracy;

    /**
     * 
     * Constructor        
     *
     * <hr>
     * Date created: Nov 11, 2018 
     *
     *
     */
    public Weapon() {
        // TODO Auto-generated constructor stub
        name = "fist";
        damage = 1;
        accuracy = 1.0;
    }

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