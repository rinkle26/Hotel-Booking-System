package domain.login;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.Connection;

import db.DbManager;

/**
 * Servlet implementation class Login
 */
@WebServlet("/BookRoom")
public class BookRoom extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public BookRoom() {
    	DbManager db = new DbManager();
		Connection conn = (Connection) db.getConnection();
		if (conn == null)
			System.out.println("DB connection failed");
		else
			System.out.println("DB connection successfull");
    }
    
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	//	CustomerDao customerDao = new CustomerDaoImpl();
		RoomDao roomDao = new RoomDaoImpl();
		String EnteredRoomNumber = request.getParameter("enteredRoomNumber");
		String submitType = request.getParameter("View Room");
//		Login login = new Login(username, pass);
//		Customer c = customerDao.validateCustomer(login);
//		System.out.println("===== "+submitType+" --- "+username+" --- "+pass+" -- "+c.getName()+" ========");
		if(submitType.equals("View Room")){
			// print the database
			//int i = 0;
			//while (i < 10) {
			ArrayList<Room> r = roomDao.ViewRoom();
			String available_rooms="";
			Room tempr;
			for(int i=0;i<r.size();i++) {
				tempr=r.get(i);
				available_rooms=available_rooms+tempr.getNumberOfRooms()+" "+tempr.getRoomNumber()+" "+tempr.getRoomType()+"\n";
			}
			request.setAttribute("successMessage",available_rooms);
			//System.out.println(r.getNumberOfRooms());
			//i++;	
			//}
			request.getRequestDispatcher("hotels.jsp").forward(request, response);			
		}else{
			Room r = new Room();
			int status = 0;
			r.setRoomNumber(request.getParameter("enteredRoomNumber"));
			status = roomDao.BookRoom(r);
			if (status == 1){
			request.setAttribute("successMessage", "Room booked successfully");	
			}
			request.getRequestDispatcher("hotels.jsp").forward(request, response);			
		}
		
//			System.out.println("Login successfull");
//			request.setAttribute("message", "Hello "+c.getName());
//			request.getRequestDispatcher("welcome.jsp").forward(request, response);
		/*}else if(submitType.equals("Register")){
			c.setName(request.getParameter("name"));
			c.setUsername(request.getParameter("username"));
			c.setPassword(request.getParameter("password"));
			customerDao.register(c);
			request.setAttribute("successMessage", "Registration done, please login!");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}else{
			request.setAttribute("message", "Data Not Found! Please register!");
			request.getRequestDispatcher("register.jsp").forward(request, response);
		}*/

	}

}
