package kr.or.human.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.or.human.service.MemberService;

@Controller
public class MemberController {
	MemberController(){
		System.out.println("MemberController 생성자 실행");
	}

	// IoC
	// Inversion of Control
	// 제어의 역전
	// 타입에 맞는 클래스를 찾아서 대신 생성 해줌
	// 정확히 동일한 클래스 또는 자동 형변환 되는 클래스
	
	// DI
	// Dependency Injection
	// 의존성 주입
	// IoC로 생성한 클래스를 변수에 넣어준다
	
	// 우선순위
	// 1. 완전히 동일한 클래스
	// 2. 자동 형 변환이 가능한 클래스
	
	@Autowired
	MemberService memberService;
	
	@RequestMapping("/member")
	String listMember() {
		System.out.println("listMember 실행");
		
//		MemberService memberService = new MemberServiceImpl();
		List memberList = memberService.getList();
		
		System.out.println(memberList);
		
		return "home";
	}

}
