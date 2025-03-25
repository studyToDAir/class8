package kr.or.human3;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

	// 로그인 페이지 표시
	@RequestMapping("/login.do")
	public ModelAndView loginForm() {
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("login");
		// \webapp\WEB-INF\views\login.jsp
		// "\webapp" : "/"
		// /WEB-INF/views/login.jsp
		// login
		return mav;
	}
	
	@RequestMapping("/login")
	public ModelAndView login(HttpServletRequest request) {
		
//		ModelAndView mav = new ModelAndView();
//		mav.setViewName("result");
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		System.out.println("아이디 : "+ id);
		System.out.println("비밀번호 : "+ pw);
		
		request.setAttribute("id1", id);
		
		ModelAndView mav = new ModelAndView("result");
		mav.addObject("id2", id);
		
		MemberDTO memberDTO = new MemberDTO();
		memberDTO.setId(id);
		mav.addObject("dto", memberDTO);
		
		return mav;
	}
	
	@RequestMapping("/login2")
	public ModelAndView login2(
			// String id = request.getParameter("id") 과 같음
			// 기본적으로 필수값. 없다면 400 Bad Request 코드 발생
			// 즉, required=true가 기본값
//			@RequestParam("id")
			@RequestParam(value="id", required=false)
			String id,
			
			// parameter의 key와 변수명이 같다면 @RequestParam 생략 가능
			// @RequestParam을 생략하면 아렛줄이 생략됨
			// @RequestParam(value="pw", required=false)
			String pw
			, String a, // 안줬으니까 null
//			, int b // null이 안들어가서 500 오류
			@RequestParam 
			Map map
	) {
		
//		String id = request.getParameter("id");
		System.out.println("아이디 : "+ id);
		System.out.println("비밀번호 : "+ pw);
		System.out.println("map.id : "+ map.get("id"));
		ModelAndView mav = new ModelAndView("result");
		return mav;
	}
	
	@RequestMapping("/login3")
	public ModelAndView login3(
			// 파라메터에서 꺼내서
			// DTO에 알아서 넣어 줌
			@ModelAttribute
			MemberDTO dto1,
			
			// DTO를 자동으로 채우고
			// 모델에 넣어주기까지 해줌, 아랫줄 생략 가능
			// mav.addObject("dto22", dto2);
			@ModelAttribute("dto22")
			MemberDTO dto2,

			// DTO타입의 앞글자만 소문자로 변경한 key로
			// 모델에 넣어줌
			// @ModelAttribute("memberDTO")
			MemberDTO dto3,
			MemberDTO dto4
	) {
		System.out.println("dto1 : "+ dto1);
		
		ModelAndView mav = new ModelAndView("result");
		mav.addObject("dto11", dto1);
		
//		mav.addObject("memberDTO", dto4);
		return mav;
	}
	
}
