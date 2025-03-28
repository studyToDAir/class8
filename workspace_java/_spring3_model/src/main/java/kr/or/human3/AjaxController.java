package kr.or.human3;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AjaxController {

	@RequestMapping("/ajax.do")
	public String ajax() {
		return "ajax";
	}
	
	@RequestMapping(value="/ajax1")
	public String ajax1(
//			@RequestParam("id") // json으로 보낸건
								// @RequestParam이나 request.getParameter로 받을 수 없다
			@RequestBody
			MemberDTO dto
	) {
		
		System.out.println("id : "+ dto.getId());
		
		return "ajax";
	}
	
	@RequestMapping(value="/ajax2")
	@ResponseBody
	public String ajax2(
			@RequestBody
			MemberDTO dto
	) {
		
		System.out.println("id : "+ dto.getId());
		
		return "ajax";
	}

	@RequestMapping(value="/ajax3")
	@ResponseBody
	public MemberDTO ajax3(
			@RequestBody
			MemberDTO dto
	) {
		
		System.out.println("id : "+ dto.getId());
		
		return dto;
	}
	
	@RequestMapping(value="/ajax4")
	@ResponseBody
	public List ajax4(
			@RequestBody
			MemberDTO dto
	) {
		
		System.out.println("id : "+ dto.getId());
		
		List list = new ArrayList();
		list.add(dto);
		list.add(dto);
		list.add(dto);
		
		return list;
	}
}
