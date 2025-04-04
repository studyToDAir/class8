package kr.or.human.service;

import java.util.List;
import java.util.Map;

import kr.or.human.dto.EmpDTO;

public interface EmpService {

	public List<EmpDTO> getEmpList();
	public EmpDTO getEmpOne();
	public EmpDTO getEmpno(int empno);
	public EmpDTO getEmpno2(EmpDTO empDTO);
	public int modifyEmp(EmpDTO empDTO);
	public int joinEmp(EmpDTO empDTO);
	public int retireEmp(EmpDTO empDTO);
	public Map<String, Object> getEmpSearchList(EmpDTO empDTO);
	
}
