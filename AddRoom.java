package domain.login;

import java.io.IOException;
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
@WebServlet("/AddRoom")
public class AddRoom extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public AddRoom() {
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
		String NumberOfRooms = request.getParameter("NumberOfRooms");
		String RoomType = request.getParameter("RoomType");
		String RoomNumber = request.getParameter("RoomNumber");
		System.out.println("===== "+NumberOfRooms+" --- "+RoomType+" --- "+RoomNumber+" ========");
		Room r = new Room();
		r.setNumberOfRooms("NumberOfRooms");
		r.setRoomType("RoomType");
		r.setRoomNumber("RoomNumber");
		roomDao.addNewRoom(r);
		request.setAttribute("successMessage", "Room(s) added successfully");
		request.getRequestDispatcher("addRoom.jsp").forward(request, response);
//		Login login = new Login(username, pass);
//		Customer c = customerDao.validateCustomer(login);
//		System.out.println("===== "+submitType+" --- "+username+" --- "+pass+" -- "+c.getName()+" ========");
		
		/*if(submitType.equals("Login") && c!=null && c.getName()!=null){*/
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
