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
 * Individual rooms of dungeon
 *
 * <hr>
 * Date created: Nov 11, 2018
 * Last Modified: Nov 11, 2018
 * <hr>
 * @author Thomas Tran
 */
public class Room
{
	private RoomType roomType;			//room type @see RoomType.java
	private String roomIcon;			//displayable icon for room
	private boolean occupied;			//if player is here
	private boolean explored;			//if player has been here
	
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
		this.explored = false;
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
	 * @param roomType - type of room
	 * @param occupied - player is currently here
	 * @param explored - player was here
	 */
	public Room(String roomType, boolean occupied, boolean explored)
	{
		this.roomType = RoomType.valueOf (roomType);
		this.occupied = occupied;
		this.explored = explored;
		this.roomIcon = this.determineIcon();
	}
	
	/**
	 * @return occupied
	 */
	protected boolean isOccupied ( )
	{
		return occupied;
	}

	
	/**
	 * @param occupied the occupied to set
	 */
	protected void setOccupied (boolean occupied)
	{
		this.occupied = occupied;
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
		String emptyRoom = "[  ]";			//empty Room icon
		String occupiedRoom = "[x]";		//occupied Room icon
		String exploredRoom = "[e]";		//explored Room icon
		
		String roomState;					//holds what the room state is
		String icon = "|failed to load|";	//completed room icon
		
		if(this.occupied)
			roomState = occupiedRoom;
		else if(this.explored)
			roomState = exploredRoom;
		else
			roomState = emptyRoom;
		
		if(roomType.equals (RoomType.START))
			icon = " " + roomState + "-";
		else if(roomType.equals (RoomType.PASSAGE) || roomType.equals (RoomType.EXIT))
			icon = "-" + roomState + "-";
		
		return icon;
	}


	
	/**
	 * @return roomIcon
	 */
	protected String getRoomIcon ( )
	{
		this.setRoomIcon(this.determineIcon ( ));
		return roomIcon;
	}


	
	/**
	 * @param roomIcon the roomIcon to set
	 */
	protected void setRoomIcon (String roomIcon)
	{
		this.roomIcon = roomIcon;
	}


	
	/**
	 * @return explored
	 */
	protected boolean isExplored ( )
	{
		return explored;
	}


	
	/**
	 * @param explored the explored to set
	 */
	protected void setExplored (boolean explored)
	{
		this.explored = explored;
	}
	
	
	
}
