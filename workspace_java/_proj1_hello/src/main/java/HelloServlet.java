

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */
//@WebServlet("/HelloServlet")
//@WebServlet("/hello")
@WebServlet("/hello.human")
//@WebServlet("/hello.html")
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloServlet() {
        super();
        // TODO Auto-generated constructor stub
        System.out.println("HelloServlet 생성");
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    @Override
	protected void doGet(
			HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {

//    	response.getWriter()
//			.append("<strong>Served</strong> at: ")
//			.append(request.getContextPath());
		
		PrintWriter out = response.getWriter();
		out.println("<h1>");
		out.print("Hello Servlet 한글");
		out.println("</h1>");
		
		for(int i=0; i<5; i++) {
			out.println(i +"<br>");	
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
