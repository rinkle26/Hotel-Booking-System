package domain.login;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import db.DbManager;



public class RoomDaoImpl implements RoomDao {

	static Connection conn;
	static PreparedStatement ps;
	static PreparedStatement ps1;
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
	public ArrayList<Room> ViewRoom() {
		ArrayList<Room> r = new ArrayList<Room>();
		Room temp_room;
		try{
			conn = db.getConnection();
			ps =conn.prepareStatement("select * from room");
			
			ResultSet rs = ps.executeQuery();
			
			//rs.next();
			while(rs.next()){
				temp_room = new Room();
				temp_room.setRoomType(rs.getString(1));
				temp_room.setRoomNumber(rs.getString(2));
				temp_room.setNumberOfRooms(rs.getString(3));
				r.add(temp_room);
			}
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
			ps =conn.prepareStatement("UPDATE room SET RoomAvailability = '0' WHERE roomNumber = ?");
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
			ps =conn.prepareStatement("UPDATE room SET RoomAvailability = '1' WHERE roomNumber = ?");
			ps.setString(1, r.getRoomNumber());			
			int rs = ps.executeUpdate();
			conn.close();
		}catch(Exception e){
			System.out.println(e);
		}		
		return status;
	}
	
	public boolean EditRoom(String r, String updated) {
		boolean status = false;
		try{
			conn = db.getConnection();
			ps =conn.prepareStatement("UPDATE room SET RoomAvailability = '1' WHERE roomNumber = ?");
			ps.setString(1, r);	
			System.out.println(r);
			int rs1 = ps.executeUpdate();
			ps1 =conn.prepareStatement("UPDATE room SET RoomAvailability = '0' WHERE roomNumber = ?");
			ps1.setString(1, updated);
			System.out.println(updated);
			
			int rs2 = ps1.executeUpdate();
			
			System.out.println("ps "+rs1+" ps1 "+rs2);
			
			if (rs1 == 1 && rs2 == 1)
				status = true;
			conn.close();
		}catch(Exception e){
			System.out.println(e);
		}		
		return status;
	}

}
