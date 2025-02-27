package kr.or.human.a;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/send")
public class SendServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("/send doGet 실행");
		
		String text = request.getParameter("text");
		System.out.println("text : "+ text);
		
		// 응답으로 가야할 곳을 알려줌
		// 클라이언트가 해당 주소로 이동해줌
		// 즉, 응답을 받았으니까 접속을 끊고 
		// 새로운 주소로 다시 접속하는걸 자동으로 해줌
		response.sendRedirect("another?text="+ text);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("/send doPost 실행");
		
		String text = request.getParameter("text");
		System.out.println("text : "+ text);
		
		response.sendRedirect("another?text="+ text);
	}

}
