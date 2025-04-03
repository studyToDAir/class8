package kr.or.human.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import kr.or.human.dto.EmpDTO;

// Data Access Object
public class EmpDAO {

	public List selectEmpList() {
		System.out.println("EmpDAO selectEmpList 실행");
		
		List resultList = new ArrayList();

		try {

			// [DB 접속] 시작
			// context.xml의 Resource 중에 jdbc/oracle 가져오기
			// JNDI 방식으로...
			Context ctx = new InitialContext();
			DataSource ds = (DataSource) ctx.lookup("java:/comp/env/jdbc/oracle");
			// 커넥션 풀에서 접속 정보를 가져오기
			// 접속이 안되면 null
			Connection con = ds.getConnection();

			// [SQL 준비]
			String query = " select * from"; // select * fromemp
			query += " emp";
			
			PreparedStatement ps = con.prepareStatement(query);

			// [SQL 실행] 및 [결과 확보]
			// ResultSet executeQuery() : SQL 중 select 실행
			// int executeUpdate() : select 외 모든 것
			// ResultSet : select 조회 결과 전체 : 엑셀 테이블 느낌
			ResultSet rs = ps.executeQuery();

			// 결과 활용
//						rs.next();     	// 다음 줄로 커서를 이동
			// 다음 줄이 있으면 true, 없으면 false를 return

			while (rs.next()) { // 다음 줄이 없을 때 까지 반복
				int empno = rs.getInt("empno");
				String ename = rs.getString("ename");
				Date hiredate = rs.getDate("hiredate");
				System.out.println("----------");
				System.out.print(" empno : " + empno);
				System.out.print(" ename : " + ename);
				System.out.print(" hiredate : " + hiredate);
				System.out.println();

				EmpDTO empDTO = new EmpDTO();
				empDTO.setEmpno(empno);
				empDTO.setEname(ename);
				empDTO.setHiredate(hiredate);

				resultList.add(empDTO);
			}

			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return resultList;
	}

}
