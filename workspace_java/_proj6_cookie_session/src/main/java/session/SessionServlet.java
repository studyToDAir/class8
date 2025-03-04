package session;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/session")
public class SessionServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 세션을 가져오는 방법
		
		// 기존 세션이 없으면 새로 만들어주고
		// 있으면 그걸 가져옴
		HttpSession session = request.getSession();

//		// 기존 세션이 없으면 null, 있으면 가져옴
//		HttpSession session = request.getSession(false);
		
		// 세션에서 가져오기
		// 없으면 null
		String value = (String)session.getAttribute("key");
		System.out.println("value : "+ value);
		
		// 세션에 저장
		session.setAttribute("key", "value");
		
		
		// 로그인 예제
		if("admin".equals( request.getParameter("id") )) {
			session.setAttribute("isLogon", true);
		}
		
	}

}
