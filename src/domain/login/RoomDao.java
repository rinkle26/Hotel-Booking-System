package domain.login;

import java.util.ArrayList;

/**
 * 
 * @author mehra
 * The methods that we need to save and retrieve data from the database
 */
public interface RoomDao {

	/**
	 * 
	 * @param c
	 * @return
	 */
	public int addNewRoom(Room r);
	public int BookRoom(Room r);
	public int CancelRoom(Room r);
	/*
	 * Retrieve the Customer object from the database
	 */
	public ArrayList<Room> ViewRoom();
	public boolean EditRoom(String r,String updated);

	
	//public Customer getCustomer(String username, String pass); This method does not needed as we have the Login object

	
}

