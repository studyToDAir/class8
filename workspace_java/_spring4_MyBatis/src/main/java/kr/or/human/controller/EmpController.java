package kr.or.human.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.or.human.dto.EmpDTO;
import kr.or.human.service.EmpService;

@Controller
public class EmpController {
	
	@Autowired
	EmpService empService;

	@RequestMapping(value="/emp", method=RequestMethod.GET)
	public String listEmp() {
		List<EmpDTO> list = empService.getEmpList();
		System.out.println("list.size : "+ list.size());
		return "emp";
	}
	
}
