package cookie;

import java.io.IOException;
import java.net.URLDecoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/get")
public class GetCookie extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html; charset=utf-8;");
		
		// 쿠키가 하나도 없으면 null
		Cookie[] cookies = request.getCookies();
		
		boolean isShow = true;
		
		if(cookies != null) {
			for(int i=0; i<cookies.length; i++) {
				Cookie c = cookies[i];
				String name = c.getName();
				String value = c.getValue();
				System.out.println("name: "+ name +", value: "+ value);
				
				if("name2".equals(name)) {
					String str = URLDecoder.decode(value, "utf-8");
					System.out.println("str : "+ str);
				}
				
				if("key".equals(name) && "value".equals(value)) {
					isShow = false;
				}
				
			}
		} else {
			System.out.println("쿠키가 없습니다");
		}
		
		if(isShow) {
			response.getWriter().println("<h1>아주 귀찮은 팝업</h1>");
		}
	}

}
