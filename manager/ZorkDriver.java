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
		boolean gameRun = true;			//tracks if the game is running
		int directionButton = 2;
		int quitButton = 0;
		int playerLocation = 0;
		
		String[] movement = {"Left", "Right"};
		String[] quit = {"Yes", "No"};
		
		Cartographer.generateMap ( );

		while(gameRun)
		{
			System.out.print (playerLocation);
			Cartographer.updateMap (playerLocation,directionButton);
			directionButton = JOptionPane.showOptionDialog (null, 
											Cartographer.mapData+ "\n\n", 
											"Where do you want to go",
											JOptionPane.PLAIN_MESSAGE,
											JOptionPane.DEFAULT_OPTION,
											null, 
											movement,
											0);
			
			//determines if they are going left or right
			switch(directionButton)
			{
				case 0:
					if(playerLocation != 0)
						playerLocation--;
					else
						JOptionPane.showMessageDialog (null, "You can't go that way", null, JOptionPane.PLAIN_MESSAGE);
					break;
				case 1:
					if(playerLocation < Cartographer.roomCount-1)
						playerLocation++;
					else
					{
						JOptionPane.showMessageDialog (null, "You have escaped and completed the dungeon!", null, JOptionPane.PLAIN_MESSAGE);
						gameRun = false;
					}
					break;
				default:
					 quitButton = JOptionPane.showOptionDialog (null, 
						 "Are you sure you want to quit?", 
						null,
						JOptionPane.PLAIN_MESSAGE,
						JOptionPane.DEFAULT_OPTION,
						null, 
						quit,
						0);
					 switch(quitButton)
					 {
						 case 0:
							 JOptionPane.showMessageDialog (null, 
								 	"Goodbye, thank you for playing\nBy Thomas Tran and Robert Carlton",
									":(",
									JOptionPane.PLAIN_MESSAGE);
							 System.exit (-1);
						 case 1:
						 default:
							 break;
							 
							 
					 }
			}
			
			if(gameRun == false)
				break;
			
		}//end while(gamerun)
		
		JOptionPane.showMessageDialog (null, 
						" Thanks for playing!\nProgrammed by Thomas Tran and Robert Carlton",
						"CONGRATULATIONS",
						JOptionPane.PLAIN_MESSAGE);


	}

}
