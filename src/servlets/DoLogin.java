package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DoLogin
 */
@WebServlet("/DoLogin")
public class DoLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DoLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//사용자가 입력한 form data를 읽어 들임
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		//business logic 수행 (사용자가 입력한 username과 password를 출력하자)
		PrintWriter out = response.getWriter();
		
		//HTML code 생성
		String htmlResponse = "<html>";
		
		htmlResponse += "<h2>Your name : "+username+"<br />";
		htmlResponse += "Your Password : "+password+"</h2>";
		htmlResponse += "</html>";
		
		out.println(htmlResponse);
	}

}
