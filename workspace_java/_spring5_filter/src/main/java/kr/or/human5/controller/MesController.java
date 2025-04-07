package kr.or.human5.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.or.human5.dto.MemberDTO;

@Controller
public class MesController {

	String id = "admin";
	String pw = "1234";
	String name = "관리자";
	
	@RequestMapping("/login")
	public String login() {
		return "login";
	}
	
	@RequestMapping("/loginCheck")
	public String loginCheck(MemberDTO dto, HttpServletRequest req) {
		
		// 만약 로그인 성공하면
		if(dto.getId().equals(this.id)
				&& dto.getPw().equals(this.pw)) {
			System.out.println("로그인 성공");
			
			dto.setName(this.name);
			
			// 세션에 담기
			HttpSession session = req.getSession();
			session.setAttribute("dto", dto);
			
			// main으로 이동
			return "redirect:main";
		} else {
			// 실패 시 login으로 이동
			return "redirect:login?msg=2";
		}
	}

	@RequestMapping("/main")
	public String main(HttpServletRequest req) {
		// 로그인 한 사람만 보기
		// 안한 사람은 login으로 이동
		
//		HttpSession session = req.getSession();
//		MemberDTO dto = (MemberDTO)session.getAttribute("dto");
//		
//		if(dto == null) {
//			return "redirect:login?msg=2";
//		} else {
//			return "main";
//		}

		return "main";
	}

	@RequestMapping("/main2")
	public String main2(HttpServletRequest req) {
		// 로그인 한 사람만 보기
		// 안한 사람은 login으로 이동
		
//		HttpSession session = req.getSession();
//		MemberDTO dto = (MemberDTO)session.getAttribute("dto");
//		
//		if(dto == null) {
//			return "redirect:login?msg=2";
//		} else {
//			return "main2";
//		}

		return "main2";
	}
	
}
