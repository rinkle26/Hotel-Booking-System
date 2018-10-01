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
	public Room BookRoom() {
		Room r = new Room();
		try{
			conn = db.getConnection();
			ps =conn.prepareStatement("select * from room");
			
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				r.setRoomType(rs.getString(1));
				r.setRoomNumber(rs.getString(2));
				r.setNumberOfRooms(rs.getString(3));
			}
			conn.close();
		}catch(Exception e){
			System.out.println(e);
		}
		return r;
	}

}
