package group6;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public LoginServlet() {
        super();
   
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
	}
		
		

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
		 String username = request.getParameter("username");
		 String password = request.getParameter("password");
		
		
		 if ("admin".equals(username) && "password".equals(password)) {
		 HttpSession session = request.getSession(true);
		 session.setAttribute("username", username);
		 response.sendRedirect("Welcome.jsp");
		 } else {
		 response.sendRedirect("Error.jsp");
		 }
		
	
	}

}
