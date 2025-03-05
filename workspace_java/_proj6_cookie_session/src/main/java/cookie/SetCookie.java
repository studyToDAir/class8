package cookie;

import java.io.IOException;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/set")
public class SetCookie extends HttpServlet {
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 만료일이 있는 쿠키 만들기
		// 브라우저 자체에 SQLite(DB)또는 파일로 저장
		Cookie c1 = new Cookie("key", "value");
//		c1.setMaxAge(60*60*24); // 초 단위
		c1.setMaxAge(10); // 초 단위
		response.addCookie(c1); // response에 담아서 브라우저에 전송하면 알아서 저장 함
		
		// 만료일이 없는 세션쿠키 만들기
		Cookie c2 = new Cookie("name", "value2");
		c2.setMaxAge(-1);
		// 세션쿠키 : 만료일이 없는 쿠키
		// setMaxAge를 설정하지 않거나
		// 음수를 넣어서 만든다
		// 브라우저 메모리에만 저장됨.
		// 즉, 브라우저의 모든 탭을 끄면 사라짐
		response.addCookie(c2);
		
		String value = "한 글";
		value = URLEncoder.encode(value, "utf-8");
		System.out.println("value : "+ value);
		Cookie c3 = new Cookie("name2", value);
		response.addCookie(c3);
	}

}
