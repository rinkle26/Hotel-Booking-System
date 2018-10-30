package domain.login;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import db.DbManager;



public class RoomDaoImpl implements RoomDao {

	static Connection conn;
	static PreparedStatement ps;
	DbManager db = new DbManager();
	
	@Override
	public int addNewRoom(Room r) {
		int status = 0;
		try{
			conn = db.getConnection();
			ps =conn.prepareStatement("insert into room values(?,?,?)");
			ps.setString(1, r.getNumberOfRooms());
			ps.setString(2, r.getRoomNumber());
			ps.setString(3, r.getRoomType());
			status = ps.executeUpdate();
			conn.close();
		}catch(Exception e){
			System.out.println(e);
		}
		return status;
	}

	@Override
	public Room ViewRoom() {
		Room r = new Room();
		try{
			conn = db.getConnection();
			ps =conn.prepareStatement("select * from room");
			
			ResultSet rs = ps.executeQuery();
			rs.next();
		//	while(rs.next()){
				r.setRoomType(rs.getString(1));
				r.setRoomNumber(rs.getString(2));
				r.setNumberOfRooms(rs.getString(3));
			//}
			conn.close();
		}catch(Exception e){
			System.out.println(e);
		}
		return r;
	}
	
	@Override
	public int BookRoom(Room r) {
		int status = 0;
		try{
			conn = db.getConnection();
			ps =conn.prepareStatement("UPDATE room SET RoomAvailability = 1 WHERE roomNumber = ?");
			ps.setString(1, r.getRoomNumber());			
			int rs = ps.executeUpdate();
			conn.close();
		}catch(Exception e){
			System.out.println(e);
		}		
		return status;
	}
	
	@Override
	public int CancelRoom(Room r) {
		int status = 0;
		try{
			conn = db.getConnection();
			ps =conn.prepareStatement("UPDATE room SET RoomAvailability = 0 WHERE roomNumber = ?");
			ps.setString(1, r.getRoomNumber());			
			int rs = ps.executeUpdate();
			conn.close();
		}catch(Exception e){
			System.out.println(e);
		}		
		return status;
	}

}
