/**
 * ---------------------------------------------------------------------------
 * File name: Room.java
 * Project name: 1260-001-TranThomas-CarltonRobert-Project5
 * ---------------------------------------------------------------------------
 * Creator's name and email: Thomas Tran, trantt@etsu.edu
 * Course:  CSCI 1260
 * Creation Date: Nov 11, 2018
 * Last Modified: Nov 11, 2018
 * ---------------------------------------------------------------------------
 */

package manager;


/**
 * Enter type purpose here
 *
 * <hr>
 * Date created: Nov 11, 2018
 * Last Modified: Nov 11, 2018
 * <hr>
 * @author Thomas Tran
 */
public class Room
{
	protected RoomType roomType;		//room type @see RoomType.java
	protected String roomIcon;			//displayable icon for room
	private boolean occupied;			//if player is here
	
	/**
	 * Default Constructor of Room   
	 *
	 * <hr>
	 * Date created: Nov 11, 2018 
	 * Last Modified: Nov 11, 2018
	 *
	 * 
	 */
	public Room ( )
	{
		this.roomType = RoomType.START;
		this.occupied = true;
		this.roomIcon = " [x]-";
		
	}
	
	/**
	 * 
	 * Parameterized Constructor of Room   
	 *
	 * <hr>
	 * Date created: Nov 11, 2018 
	 * Last Modified: Nov 11, 2018
	 *
	 * 
	 * @param roomType
	 */
	public Room(String roomType, boolean occupied)
	{
		this.roomType = RoomType.valueOf (roomType);
		this.occupied = occupied;
		this.roomIcon = this.determineIcon();
	}

	/**
	 * 
	 * Generates an appropriate displayable icon for the room        
	 *
	 * <hr>
	 * Date created: Nov 11, 2018
	 * Last Modified: Nov 11, 2018
	 *
	 * <hr>
	 * @return displayable icon
	 */
	private String determineIcon()
	{
		String emptyRoom = "[ ]";
		String occupiedRoom = "[x]";
		
		String roomState;
		String icon = "|failed to load|";
		
		if(this.occupied)
			roomState = occupiedRoom;
		else
			roomState = emptyRoom;
		
		if(roomType.equals (RoomType.START))
			icon = " " + roomState + "-";
		else if(roomType.equals (RoomType.PASSAGE) || roomType.equals (RoomType.EXIT))
			icon = "-" + roomState + "-";
		
		return icon;
	}
}
