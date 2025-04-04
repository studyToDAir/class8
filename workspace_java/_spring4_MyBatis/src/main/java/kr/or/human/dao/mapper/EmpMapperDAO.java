package kr.or.human.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import kr.or.human.dto.EmpDTO;

@Mapper
public interface EmpMapperDAO {

	List<EmpDTO> selectEmp();
	
	@Select("select * from emp2 where empno = #{empno}")
	List<EmpDTO> selectDetailEmp(@Param("empno") int empno);
	
	
}
