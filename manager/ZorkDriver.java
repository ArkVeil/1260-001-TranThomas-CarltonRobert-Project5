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

import javax.swing.JOptionPane;

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

		DungeonMaster.runPlayLoop ( );
		JOptionPane.showMessageDialog (null, 
			" Thanks for playing!\nProgrammed by Thomas Tran and Robert Carlton",
			"CONGRATULATIONS",
			JOptionPane.PLAIN_MESSAGE);
		
		
		
		


	}//end of main(String [ ] args)s

}
