package kr.or.human.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.or.human.dto.EmpDTO;

@Repository
public class EmpDAOImpl implements EmpDAO {

	@Autowired
	SqlSession sqlSession;
	
	@Override
	public List<EmpDTO> selectEmpList() {
		List<EmpDTO> result = sqlSession.selectList("mapper.emp.selectEmp");
		System.out.println("result : "+ result);
		return result;
	}
	
	@Override
	public EmpDTO selectOneEmp() {
		EmpDTO dto = sqlSession.selectOne("mapper.emp.selectOneEmp");
		System.out.println("dto: "+ dto);
		return dto;
	}
	
	@Override
	public EmpDTO selectOneEmpno(int empno) {
		EmpDTO dto = sqlSession.selectOne("mapper.emp.selectEmpno", empno);
		System.out.println("dto: "+ dto);
		return dto;
	}
	@Override
	public EmpDTO selectOneEmpno2(EmpDTO empDTO) {
		EmpDTO dto = sqlSession.selectOne("mapper.emp.selectEmpno2", empDTO);
		System.out.println("EmpDAOImpl selectOneEmpno2: "+ dto);
		return dto;
	}

	@Override
	public int updateEmp(EmpDTO empDTO) {
		int countUpdate = -1;
		
		try {
			countUpdate = sqlSession.update("mapper.emp.udpateEmp", empDTO);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return countUpdate;
	}
	
	@Override
	public int insertEmp(EmpDTO empDTO) {
		int count = -1;
		
		try {
//			count = sqlSession.insert("mapper.emp.insertEmp", empDTO);
			count = sqlSession.insert("mapper.emp.insertEmp2", empDTO);
			System.out.println(empDTO); // empno가 채워져 있음
			// 그러면 아래 같은데에서 재사용 가능
//			count = sqlSession.insert("mapper.emp.insertEmp4", empDTO);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return count;
	}
	@Override
	public int deleteEmp(EmpDTO empDTO) {
		int count = -1;
		
		try {
			count = sqlSession.delete("mapper.emp.deleteEmp", empDTO);
			System.out.println("deleteEmp :"+ count);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return count;
	}
	
	void getSeq() {
		int seq = sqlSession.selectOne("mapper.emp.getSeq");
		
		EmpDTO dto = new EmpDTO();
		dto.setEmpno(seq);
		dto.setEname("임의");
		// insert에 보내서 테이블 a에서 seq 사용
		// insert에 보내서 테이블 b에서 seq 사용
		
	}

	
	@Override
	public List<EmpDTO> selectEmpSearchList(EmpDTO dto) {
		List<EmpDTO> result = sqlSession.selectList("mapper.emp.dynamic.selectEmp", dto);
		System.out.println("result : "+ result);
		return result;
	}
}
