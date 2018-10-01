package domain.login;
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
	
	/*
	 * Retrieve the Customer object from the database
	 */
	public Room BookRoom();

	
	//public Customer getCustomer(String username, String pass); This method does not needed as we have the Login object

	
}

