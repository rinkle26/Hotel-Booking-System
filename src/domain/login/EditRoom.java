package domain.login;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import com.mysql.jdbc.Connection;

import db.DbManager;

@WebServlet("/EditRoom")
public class EditRoom extends HttpServlet{
	private static final long serialVersionUID = 1L;
    

    public EditRoom() {
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
		String oldRoomNumber = request.getParameter("oldRoomNumber");
		String UpdatedRoomNumber = request.getParameter("updatedRoomNumber");
		//String submitType = request.getParameter("View Room");
//		Login login = new Login(username, pass);
//		Customer c = customerDao.validateCustomer(login);
//		System.out.println("===== "+submitType+" --- "+username+" --- "+pass+" -- "+c.getName()+" ========");
		//if(submitType.equals("View Room")){
			// print the database
			//int i = 0;
			//while (i < 10) {
			boolean updated = roomDao.EditRoom(oldRoomNumber, UpdatedRoomNumber);
			if (updated) {
				request.setAttribute("message","updated");
				request.getRequestDispatcher("welcome.jsp").forward(request, response);	
			}
			else {
				request.setAttribute("successMessage","notUpdated, please enter correct details");
				request.getRequestDispatcher("editroom.jsp").forward(request, response);
			}
			//request.setAttribute("successMessage", r.getNumberOfRooms()+"	"+r.getRoomNumber()+"	"+r.getRoomType());
			//System.out.println(r.getNumberOfRooms());
			//i++;	
			//}
					
		/*}else{
			Room r = new Room();
			int status = 0;
			r.setRoomNumber(request.getParameter("enteredRoomNumber"));
			status = roomDao.BookRoom(r);
			if (status == 1){
			request.setAttribute("successMessage", "Room cancelled successfully");	
			}
			request.getRequestDispatcher("welcome.jsp").forward(request, response);			
		}*/
		
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
