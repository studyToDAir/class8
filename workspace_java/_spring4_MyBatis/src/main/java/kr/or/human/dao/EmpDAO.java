package kr.or.human.dao;

import java.util.List;

import kr.or.human.dto.EmpDTO;

public interface EmpDAO {

	List<EmpDTO> selectEmpList();
	public EmpDTO selectOneEmp();
	public EmpDTO selectOneEmpno(int empno);
	public EmpDTO selectOneEmpno2(EmpDTO empDTO);
	public int updateEmp(EmpDTO empDTO);
	public int insertEmp(EmpDTO empDTO);
	public int deleteEmp(EmpDTO empDTO);
	public List<EmpDTO> selectEmpSearchList(EmpDTO dto);
	public int totalList();
}
