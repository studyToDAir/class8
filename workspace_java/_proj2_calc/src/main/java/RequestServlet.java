

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/req")
public class RequestServlet extends HttpServlet {
	
    public RequestServlet() {
        super();
        System.out.println("RequestServlet 생성자 실행");
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("/req doGet실행");
		
		// 요청 내용의 한글 깨짐 방지
		request.setCharacterEncoding("utf-8");
		
		
		// 응답 내용의 한글 깨짐 방지
		response.setContentType("text/html; charset=utf-8");
		
		// getParameter
		// 전달받은 파라메터의 key를 적어서 해당 값을 얻어오기
		String num1 = request.getParameter("num1");
		System.out.println("num1 : "+ num1);

		// 없으면 null
		String num2 = request.getParameter("num2");
		System.out.println("num2 : "+ num2);
		
		// getParameterValues
		// 같은 name으로 여러개 온 경우
		// String 배열로 모두 받을 수 있음
		// 마찬가지로 없으면 null
		String[] nums = request.getParameterValues("num1");
		if(nums != null) {
			for(String num : nums) {
				System.out.println(num);
			}
		}
		
		PrintWriter out = response.getWriter();
		out.println("<strong>num1</strong>의 값은 : "+ num1);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
