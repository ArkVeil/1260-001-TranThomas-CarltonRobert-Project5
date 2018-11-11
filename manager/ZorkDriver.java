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


/**
 * Enter type purpose here
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

		for(int i = 0; i< 10; i++)
		{
			Cartographer.generateMap ( );
			Cartographer.displayMap ( );
			System.out.print (Cartographer.mapData + "\n");
		}


	}

}
