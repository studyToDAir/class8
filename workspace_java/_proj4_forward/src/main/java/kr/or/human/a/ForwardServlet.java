package kr.or.human.a;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/forward")
public class ForwardServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("/forward doGet 실행");
		
		String text = request.getParameter("text");
		System.out.println("text : "+ text);
		
		// 어차피 forward라서 여기에 적어도 소용 없음
		response.getWriter().println("사실 forward");
		
		String url = "another";
		request.getRequestDispatcher(url).forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("/forward doPost 실행");
		
		String text = request.getParameter("text");
		System.out.println("text : "+ text);
		
		// 어차피 forward라서 여기에 적어도 소용 없음
		response.getWriter().println("사실 forward");
		
		String url = "another";
		request.getRequestDispatcher(url).forward(request, response);
	}

}
